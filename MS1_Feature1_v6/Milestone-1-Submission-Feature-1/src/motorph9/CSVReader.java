package motorph9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import javax.swing.JOptionPane;

public class CSVReader {
    
    private static HashSet<String> userIDs; 
    
    
    public static void loadUserIDs() {
        userIDs = new HashSet<>();
        
        String filePath = "src\\motorph9\\EmployeeDetails.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); 
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                
                if (values.length >= 1) { 
                    userIDs.add(values[0].trim()); 
                } else {
                    System.err.println("Invalid line format: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error reading CSV file", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    public static boolean isValidUserID(String userID) {
        return userIDs != null && userIDs.contains(userID); 
    }

    
    public static String[] getUserInfo(String userID) {
        
        String filePath = "src\\motorph9\\EmployeeDetails.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine(); 
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                
                if (values.length >= 21 && values[0].trim().equals(userID)) { 
                    return values;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error reading CSV file", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}
