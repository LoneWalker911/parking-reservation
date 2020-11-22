/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;
import Frontend.Staff.StaffIF;
import Backend.*;
import Frontend.MessageBox;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import java.util.logging.Logger;
/**
 *
 * @author thisa
 */
public class StaffLogin extends javax.swing.JFrame {

    /**
     * Creates new form UserLogin
     */
    public StaffLogin() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rstbtn = new javax.swing.JButton();
        Loginbtn = new javax.swing.JButton();
        Pwdlbl = new javax.swing.JLabel();
        Unamelbl = new javax.swing.JLabel();
        txtUname = new javax.swing.JTextField();
        txtPsw = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(44, 62, 80));

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN");

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setForeground(new java.awt.Color(236, 240, 241));

        rstbtn.setBackground(new java.awt.Color(242, 38, 19));
        rstbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rstbtn.setForeground(new java.awt.Color(255, 255, 255));
        rstbtn.setText("RESET");
        rstbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rstbtnActionPerformed(evt);
            }
        });

        Loginbtn.setBackground(new java.awt.Color(34, 167, 240));
        Loginbtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Loginbtn.setForeground(new java.awt.Color(255, 255, 255));
        Loginbtn.setText("Login");
        Loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginbtnActionPerformed(evt);
            }
        });

        Pwdlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Pwdlbl.setForeground(new java.awt.Color(236, 240, 241));
        Pwdlbl.setText("Password");

        Unamelbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Unamelbl.setForeground(new java.awt.Color(236, 240, 241));
        Unamelbl.setText("Username");

        txtUname.setBackground(new java.awt.Color(108, 122, 137));
        txtUname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnameActionPerformed(evt);
            }
        });

        txtPsw.setBackground(new java.awt.Color(108, 122, 137));
        txtPsw.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Unamelbl)
                            .addComponent(Pwdlbl))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUname, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                            .addComponent(txtPsw)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rstbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(Loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Unamelbl)
                    .addComponent(txtUname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPsw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pwdlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rstbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rstbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rstbtnActionPerformed
        txtUname.setText("");
        txtPsw.setText("");
    }//GEN-LAST:event_rstbtnActionPerformed

    private void LoginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginbtnActionPerformed
        Login login = new Login();
        if(txtUname.getText().toLowerCase().equals("removed"))
            MessageBox.infoBox("Can not use \"removed\" as username.", "Not possible");
        else if(!String.valueOf(txtPsw.getPassword()).equals("")  && !txtUname.getText().equals("")) {
            login.setUsername(txtUname.getText());
            login.setPassword(String.valueOf(txtPsw.getPassword()));
            try {
                String UserType = login.Login();
                if(!UserType.equals(""))
                {
                    StaffIF uif = new StaffIF(UserType,txtUname.getText());
                    EventLog.Write("User : " + txtUname.getText() + "Logged in");
                    uif.setVisible(true);
                    this.rstbtnActionPerformed(evt);
                    this.dispose();
                } 
            else {
                    MessageBox.infoBox("Invalid Credentials", "Login Error");
                }
                    } 
            catch (SQLException ex) {
                Logger.getLogger(StaffLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        else {
            
        }
        
    }//GEN-LAST:event_LoginbtnActionPerformed

    private void txtUnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnameActionPerformed

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
            java.util.logging.Logger.getLogger(StaffLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Loginbtn;
    private javax.swing.JLabel Pwdlbl;
    private javax.swing.JLabel Unamelbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton rstbtn;
    private javax.swing.JPasswordField txtPsw;
    private javax.swing.JTextField txtUname;
    // End of variables declaration//GEN-END:variables
}
