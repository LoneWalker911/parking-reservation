/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fronend.Staff;

import Fronend.AddRole;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thisa
 */
public class StaffIF extends javax.swing.JFrame {

    /**
     * Creates new form StaffIF
     * @param ut
     */
    private static String ut="";
    private static String uname="";
    
    public StaffIF(String usertype, String uname) {
        initComponents();
//        mngstaffpanel.setVisible(false);
//        mngrolespanel.setVisible(false);
        ut=usertype;
        UserType.setText(ut);
        
    }
    public StaffIF() {
        initComponents();
//        mngrolespanel.setVisible(false);
//        mngstaffpanel.setVisible(false);
    }




    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addstaffbtn1 = new javax.swing.JButton();
        UserType = new javax.swing.JLabel();
        mngstaffbtn = new javax.swing.JButton();
        UTlbl = new javax.swing.JLabel();
        tabpane = new javax.swing.JTabbedPane();
        mngstaffpanel = new javax.swing.JPanel();
        addstaffbtn = new javax.swing.JButton();
        changepswbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        unamelbl = new javax.swing.JLabel();
        mngstaffbtn1 = new javax.swing.JButton();
        mngstaffbtn2 = new javax.swing.JButton();
        mngstaffbtn3 = new javax.swing.JButton();
        mngstaffbtn4 = new javax.swing.JButton();
        mngstaffbtn5 = new javax.swing.JButton();

        addstaffbtn1.setText("ADD STAFF MEMBER");
        addstaffbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addstaffbtn1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UserType.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UserType.setText("Usertype");

        mngstaffbtn.setText("MANAGE STAFF");
        mngstaffbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngstaffbtnActionPerformed(evt);
            }
        });

        UTlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UTlbl.setText("Staff Level : ");

        tabpane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mngstaffpanel.setName("Staff"); // NOI18N

        addstaffbtn.setText("ADD STAFF MEMBER");
        addstaffbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addstaffbtnActionPerformed(evt);
            }
        });

        changepswbtn.setText("CHANGE PASSWORD");
        changepswbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepswbtnActionPerformed(evt);
            }
        });

        jButton1.setText("SEARCH STAFF");

        jButton2.setText("REMOVE STAFF");

        jButton3.setText("UPDATE STAFF");

        javax.swing.GroupLayout mngstaffpanelLayout = new javax.swing.GroupLayout(mngstaffpanel);
        mngstaffpanel.setLayout(mngstaffpanelLayout);
        mngstaffpanelLayout.setHorizontalGroup(
            mngstaffpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mngstaffpanelLayout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addGroup(mngstaffpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(changepswbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addstaffbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(235, 235, 235))
        );
        mngstaffpanelLayout.setVerticalGroup(
            mngstaffpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mngstaffpanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(addstaffbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changepswbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addGap(343, 343, 343))
        );

        tabpane.addTab("STAFF", null, mngstaffpanel, "");

        jButton5.setText("DELETE CUSROMER");

        jButton6.setText("UPDATE CUSTOMER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(224, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jButton6)
                .addGap(34, 34, 34)
                .addComponent(jButton5)
                .addContainerGap(502, Short.MAX_VALUE))
        );

        tabpane.addTab("CUSTOMER", jPanel1);

        jButton7.setText("ADD");

        jButton8.setText("UPDATE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(293, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8)
                    .addComponent(jButton7))
                .addGap(218, 218, 218))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jButton7)
                .addGap(79, 79, 79)
                .addComponent(jButton8)
                .addContainerGap(369, Short.MAX_VALUE))
        );

        tabpane.addTab("SLOT", jPanel2);

        jButton9.setText("VIEW");

        jButton10.setText("SEARCH");

        jButton11.setText("PAYMENT");

        jButton12.setText("UPDATE");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton15.setText("CANCEL");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton15)
                    .addComponent(jButton9)
                    .addComponent(jButton10)
                    .addComponent(jButton12)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(272, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12)
                .addGap(18, 18, 18)
                .addComponent(jButton11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton15)
                .addContainerGap(438, Short.MAX_VALUE))
        );

        tabpane.addTab("RESERVATI0ON", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 631, Short.MAX_VALUE)
        );

        tabpane.addTab("VEHICLE", jPanel4);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Username : ");

        unamelbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        unamelbl.setText("Username");

        mngstaffbtn1.setText("CUSTOMER MANAGEMENT");
        mngstaffbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngstaffbtn1ActionPerformed(evt);
            }
        });

        mngstaffbtn2.setText("VEHICLE ");
        mngstaffbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngstaffbtn2ActionPerformed(evt);
            }
        });

        mngstaffbtn3.setText("SLOT CONTROL");
        mngstaffbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngstaffbtn3ActionPerformed(evt);
            }
        });

        mngstaffbtn4.setText("RESERVATION");
        mngstaffbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngstaffbtn4ActionPerformed(evt);
            }
        });

        mngstaffbtn5.setText("PAYEMENT");
        mngstaffbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngstaffbtn5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(UTlbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(UserType))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(unamelbl))
                            .addComponent(mngstaffbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mngstaffbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mngstaffbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mngstaffbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mngstaffbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mngstaffbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(tabpane, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UserType)
                    .addComponent(UTlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(unamelbl))
                .addGap(18, 18, 18)
                .addComponent(mngstaffbtn)
                .addGap(18, 18, 18)
                .addComponent(mngstaffbtn1)
                .addGap(26, 26, 26)
                .addComponent(mngstaffbtn3)
                .addGap(18, 18, 18)
                .addComponent(mngstaffbtn4)
                .addGap(22, 22, 22)
                .addComponent(mngstaffbtn2)
                .addGap(31, 31, 31)
                .addComponent(mngstaffbtn5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 47, Short.MAX_VALUE)
                .addComponent(tabpane, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mngstaffbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngstaffbtnActionPerformed
        tabpane.setSelectedIndex(0);
            
            
        
    }//GEN-LAST:event_mngstaffbtnActionPerformed

    private void changepswbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepswbtnActionPerformed
        ChangeStaffPassword newpsw = new ChangeStaffPassword();
        newpsw.setVisible(true);
        newpsw.newpswlbl.setVisible(false);
    }//GEN-LAST:event_changepswbtnActionPerformed

    private void addstaffbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addstaffbtnActionPerformed
        AddStaff stf = new AddStaff();
        stf.setVisible(true);
    }//GEN-LAST:event_addstaffbtnActionPerformed

    private void mngstaffbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngstaffbtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mngstaffbtn1ActionPerformed

    private void mngstaffbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngstaffbtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mngstaffbtn2ActionPerformed

    private void mngstaffbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngstaffbtn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mngstaffbtn3ActionPerformed

    private void mngstaffbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngstaffbtn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mngstaffbtn4ActionPerformed

    private void mngstaffbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngstaffbtn5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mngstaffbtn5ActionPerformed

    private void addstaffbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addstaffbtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addstaffbtn1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

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
            java.util.logging.Logger.getLogger(StaffIF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffIF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffIF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffIF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffIF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UTlbl;
    private javax.swing.JLabel UserType;
    private javax.swing.JButton addstaffbtn;
    private javax.swing.JButton addstaffbtn1;
    private javax.swing.JButton changepswbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton mngstaffbtn;
    private javax.swing.JButton mngstaffbtn1;
    private javax.swing.JButton mngstaffbtn2;
    private javax.swing.JButton mngstaffbtn3;
    private javax.swing.JButton mngstaffbtn4;
    private javax.swing.JButton mngstaffbtn5;
    private javax.swing.JPanel mngstaffpanel;
    private javax.swing.JTabbedPane tabpane;
    private javax.swing.JLabel unamelbl;
    // End of variables declaration//GEN-END:variables
}
