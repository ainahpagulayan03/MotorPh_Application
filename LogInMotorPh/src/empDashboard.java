
import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Dell
 */
public class empDashboard extends javax.swing.JFrame {

   
    public empDashboard() {
        initComponents();
    
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtonDash = new javax.swing.JButton();
        jButtonProfile = new javax.swing.JButton();
        jButtonLogout = new javax.swing.JButton();
        jButtonWallet1 = new javax.swing.JButton();
        jButtonSup1 = new javax.swing.JButton();
        panelDash = new javax.swing.JPanel();

        jRadioButton1.setText("jRadioButton1");

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(470, 700));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logopic/empdes2.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jButtonDash.setBackground(new java.awt.Color(255, 102, 102));
        jButtonDash.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonDash.setText("Dashboard");
        jButtonDash.setActionCommand("Dashboad");
        jButtonDash.setAutoscrolls(true);
        jButtonDash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDashMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonDashMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonDashMouseExited(evt);
            }
        });
        jButtonDash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDashActionPerformed(evt);
            }
        });

        jButtonProfile.setBackground(new java.awt.Color(255, 102, 102));
        jButtonProfile.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonProfile.setText("Profile ");
        jButtonProfile.setActionCommand("Dashboad");
        jButtonProfile.setAutoscrolls(true);
        jButtonProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonProfileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonProfileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonProfileMouseExited(evt);
            }
        });
        jButtonProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProfileActionPerformed(evt);
            }
        });

        jButtonLogout.setBackground(new java.awt.Color(255, 102, 102));
        jButtonLogout.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonLogout.setText("Log Out ");
        jButtonLogout.setActionCommand("Dashboad");
        jButtonLogout.setAutoscrolls(true);
        jButtonLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonLogoutMouseExited(evt);
            }
        });
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });

        jButtonWallet1.setBackground(new java.awt.Color(255, 102, 102));
        jButtonWallet1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonWallet1.setText("Wallet ");
        jButtonWallet1.setActionCommand("Dashboad");
        jButtonWallet1.setAutoscrolls(true);
        jButtonWallet1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonWallet1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonWallet1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonWallet1MouseExited(evt);
            }
        });
        jButtonWallet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWallet1ActionPerformed(evt);
            }
        });

        jButtonSup1.setBackground(new java.awt.Color(255, 102, 102));
        jButtonSup1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonSup1.setText("Support");
        jButtonSup1.setActionCommand("Dashboad");
        jButtonSup1.setAutoscrolls(true);
        jButtonSup1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSup1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonSup1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonSup1MouseExited(evt);
            }
        });
        jButtonSup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSup1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDashLayout = new javax.swing.GroupLayout(panelDash);
        panelDash.setLayout(panelDashLayout);
        panelDashLayout.setHorizontalGroup(
            panelDashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 673, Short.MAX_VALUE)
        );
        panelDashLayout.setVerticalGroup(
            panelDashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDash, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonWallet1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSup1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(panelDash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jButtonDash, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButtonProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButtonWallet1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jButtonSup1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButtonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(panelDash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jButtonDash.getAccessibleContext().setAccessibleName("");
        jButtonDash.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDashActionPerformed

    private void jButtonDashMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDashMouseExited
        jButtonDash.setBackground(new Color (255, 0 ,51));
    }//GEN-LAST:event_jButtonDashMouseExited

    private void jButtonDashMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDashMouseEntered
        jButtonDash.setBackground (new Color (255,102, 102));
    }//GEN-LAST:event_jButtonDashMouseEntered

    private void jButtonDashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDashMouseClicked
        jButtonDash.setBackground (new Color (255,102, 102));
    }//GEN-LAST:event_jButtonDashMouseClicked

    private void jButtonProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonProfileMouseClicked
        jButtonProfile.setBackground (new Color (255,102, 102));
    }//GEN-LAST:event_jButtonProfileMouseClicked

    private void jButtonProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonProfileMouseEntered
        jButtonProfile.setBackground (new Color (255,102, 102));
    }//GEN-LAST:event_jButtonProfileMouseEntered

    private void jButtonProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonProfileMouseExited
        jButtonProfile.setBackground(new Color (255, 0 ,51));
    }//GEN-LAST:event_jButtonProfileMouseExited

    private void jButtonProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonProfileActionPerformed

    private void jButtonLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLogoutMouseClicked
        jButtonLogout.setBackground (new Color (255,102, 102));
    }//GEN-LAST:event_jButtonLogoutMouseClicked

    private void jButtonLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLogoutMouseEntered
       jButtonLogout.setBackground (new Color (255,102, 102));
    }//GEN-LAST:event_jButtonLogoutMouseEntered

    private void jButtonLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLogoutMouseExited
        jButtonLogout.setBackground(new Color (255, 0 ,51));
    }//GEN-LAST:event_jButtonLogoutMouseExited

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLogoutActionPerformed

    private void jButtonWallet1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonWallet1MouseClicked
       jButtonWallet1.setBackground (new Color (255,102, 102));
    }//GEN-LAST:event_jButtonWallet1MouseClicked

    private void jButtonWallet1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonWallet1MouseEntered
        jButtonWallet1.setBackground (new Color (255,102, 102));
    }//GEN-LAST:event_jButtonWallet1MouseEntered

    private void jButtonWallet1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonWallet1MouseExited
         jButtonWallet1.setBackground(new Color (255, 0 ,51));
    }//GEN-LAST:event_jButtonWallet1MouseExited

    private void jButtonWallet1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWallet1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonWallet1ActionPerformed

    private void jButtonSup1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSup1MouseClicked
        jButtonSup1.setBackground (new Color (255,102, 102));
    }//GEN-LAST:event_jButtonSup1MouseClicked

    private void jButtonSup1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSup1MouseEntered
        jButtonSup1.setBackground (new Color (255,102, 102));
    }//GEN-LAST:event_jButtonSup1MouseEntered

    private void jButtonSup1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSup1MouseExited
        jButtonSup1.setBackground(new Color (255, 0 ,51));
    }//GEN-LAST:event_jButtonSup1MouseExited

    private void jButtonSup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSup1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSup1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(empDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(empDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(empDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(empDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new empDashboard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDash;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JButton jButtonProfile;
    private javax.swing.JButton jButtonSup1;
    private javax.swing.JButton jButtonWallet1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelDash;
    // End of variables declaration//GEN-END:variables
}
