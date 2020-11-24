/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;
import Backend.*;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import java.util.logging.Logger;
/**
 *
 * @author Prashan
 */
public class CustomerRegister extends javax.swing.JFrame {

    /**
     * Creates new form CustomerRegister
     */
    customer cus = new customer();
    
    public CustomerRegister() {
        initComponents();
        Idtxt.setText(Integer.toString(cus.getLastid() + 1));
        Idtxt.setEditable(false);
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
        IDlbl = new javax.swing.JLabel();
        Emaillbl = new javax.swing.JLabel();
        Pwdlbl = new javax.swing.JLabel();
        Fnamelb = new javax.swing.JLabel();
        Addresslbl = new javax.swing.JLabel();
        Mobilelbl = new javax.swing.JLabel();
        Nametxt = new javax.swing.JTextField();
        Idtxt = new javax.swing.JTextField();
        Emailtxt = new javax.swing.JTextField();
        Mobiletxt = new javax.swing.JTextField();
        Pswfield = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Addresstxt = new javax.swing.JTextArea();
        Resetbtn = new javax.swing.JButton();
        Registerbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRATION FORM");

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        IDlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        IDlbl.setForeground(new java.awt.Color(236, 240, 241));
        IDlbl.setText("ID");

        Emaillbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Emaillbl.setForeground(new java.awt.Color(236, 240, 241));
        Emaillbl.setText("Email");

        Pwdlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Pwdlbl.setForeground(new java.awt.Color(236, 240, 241));
        Pwdlbl.setText("Password");

        Fnamelb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Fnamelb.setForeground(new java.awt.Color(236, 240, 241));
        Fnamelb.setText("Name ");

        Addresslbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Addresslbl.setForeground(new java.awt.Color(236, 240, 241));
        Addresslbl.setText("Address");

        Mobilelbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Mobilelbl.setForeground(new java.awt.Color(236, 240, 241));
        Mobilelbl.setText("Mobile No ");

        Nametxt.setBackground(new java.awt.Color(108, 122, 137));
        Nametxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Idtxt.setBackground(new java.awt.Color(108, 122, 137));
        Idtxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Emailtxt.setBackground(new java.awt.Color(108, 122, 137));
        Emailtxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Mobiletxt.setBackground(new java.awt.Color(108, 122, 137));
        Mobiletxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Pswfield.setBackground(new java.awt.Color(108, 122, 137));
        Pswfield.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Addresstxt.setBackground(new java.awt.Color(108, 122, 137));
        Addresstxt.setColumns(20);
        Addresstxt.setRows(5);
        jScrollPane1.setViewportView(Addresstxt);

        Resetbtn.setBackground(new java.awt.Color(242, 38, 19));
        Resetbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Resetbtn.setForeground(new java.awt.Color(255, 255, 255));
        Resetbtn.setText("RESET");
        Resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetbtnActionPerformed(evt);
            }
        });

        Registerbtn.setBackground(new java.awt.Color(34, 167, 240));
        Registerbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Registerbtn.setForeground(new java.awt.Color(255, 255, 255));
        Registerbtn.setText("REGISTER");
        Registerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Fnamelb, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(Pwdlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Mobilelbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Addresslbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Emaillbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IDlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Mobiletxt)
                            .addComponent(Emailtxt)
                            .addComponent(Idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nametxt)
                            .addComponent(Pswfield, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                        .addComponent(Registerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDlbl)
                    .addComponent(Idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fnamelb)
                    .addComponent(Nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Mobiletxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mobilelbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Addresslbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Emaillbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pswfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pwdlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Registerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(229, 229, 229))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
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

    private void ResetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetbtnActionPerformed
        Idtxt.setText(String.valueOf(Integer.toString(cus.getLastid() + 1)));
        Nametxt.setText("");
        Mobiletxt.setText("");
        Addresstxt.setText("");
        Emailtxt.setText("");
        Pswfield.setText("");
    }//GEN-LAST:event_ResetbtnActionPerformed

    private void RegisterbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterbtnActionPerformed
        cus.setCus_name(Nametxt.getText());
        cus.setCus_address(Addresstxt.getText());
        cus.setCus_email(Emailtxt.getText());
        cus.setCus_mobile(Mobiletxt.getText());
        cus.setPassword(String.copyValueOf(Pswfield.getPassword()));
        
        if(!(Nametxt.getText().equals("") || Addresstxt.getText().equals("") 
             || Emailtxt.getText().equals("") || Mobiletxt.getText().equals("") 
             || String.copyValueOf(Pswfield.getPassword()).equals("")) 
             && Mobiletxt.getText().length() == 10 && Pswfield.getPassword().toString().length() >= 8)
        {
            if(cus.addCustomer())
            {   
                Frontend.Staff.AddVehicle veh = new Frontend.Staff.AddVehicle(cus.getCus_id());
                MessageBox.infoBox("Mobile : " + cus.getCus_mobile() + "\nPassword : " + cus.getPassword() + "\nPlease make sure to remember these before click OK.", "YOUR CREDENTIALS");
                veh.setVisible(true);
                this.dispose();
            }
            else 
                MessageBox.infoBox("If this issue presists please contact admin.", "Something Went Wrong!!!");  
        }
        else MessageBox.infoBox("Please fill all the required information correctly.", "Fill required fields");  
    }//GEN-LAST:event_RegisterbtnActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Addresslbl;
    private javax.swing.JTextArea Addresstxt;
    private javax.swing.JLabel Emaillbl;
    private javax.swing.JTextField Emailtxt;
    private javax.swing.JLabel Fnamelb;
    private javax.swing.JLabel IDlbl;
    private javax.swing.JTextField Idtxt;
    private javax.swing.JLabel Mobilelbl;
    private javax.swing.JTextField Mobiletxt;
    private javax.swing.JTextField Nametxt;
    private javax.swing.JPasswordField Pswfield;
    private javax.swing.JLabel Pwdlbl;
    private javax.swing.JButton Registerbtn;
    private javax.swing.JButton Resetbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
