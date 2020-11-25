/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend.Cus_mng;
import Frontend.*;
import Backend.*;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import java.util.logging.Logger;
/**
 *
 * @author Prashan
 */
public class Updatecustomer extends javax.swing.JFrame {

    /**
     * Creates new form CustomerRegister
     */
    customer cus = new customer();
    
    public Updatecustomer(String mobile) {
        initComponents();
        idchkbtn.setEnabled(false);
        mobchkbtn.setEnabled(false);
        Mobiletxt.setText(mobile);
        mobchkbtnActionPerformed(null);
        idchkbtn.setVisible(false);
        mobchkbtn.setVisible(false);
    }
    
    public Updatecustomer() {
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
        IDlbl = new javax.swing.JLabel();
        Emaillbl = new javax.swing.JLabel();
        Fnamelb = new javax.swing.JLabel();
        Addresslbl = new javax.swing.JLabel();
        Mobilelbl = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        Idtxt = new javax.swing.JTextField();
        emailtxt = new javax.swing.JTextField();
        Mobiletxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addresstxt = new javax.swing.JTextArea();
        Resetbtn = new javax.swing.JButton();
        submitbtn = new javax.swing.JButton();
        idchkbtn = new javax.swing.JButton();
        mobchkbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UPDATE CUSTOMER");

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        IDlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        IDlbl.setForeground(new java.awt.Color(236, 240, 241));
        IDlbl.setText("ID");
        IDlbl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Emaillbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Emaillbl.setForeground(new java.awt.Color(236, 240, 241));
        Emaillbl.setText("Email");

        Fnamelb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Fnamelb.setForeground(new java.awt.Color(236, 240, 241));
        Fnamelb.setText("First Name ");

        Addresslbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Addresslbl.setForeground(new java.awt.Color(236, 240, 241));
        Addresslbl.setText("Address");

        Mobilelbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Mobilelbl.setForeground(new java.awt.Color(236, 240, 241));
        Mobilelbl.setText("Mobile No ");

        nametxt.setBackground(new java.awt.Color(108, 122, 137));
        nametxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Idtxt.setBackground(new java.awt.Color(108, 122, 137));
        Idtxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        emailtxt.setBackground(new java.awt.Color(108, 122, 137));
        emailtxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Mobiletxt.setBackground(new java.awt.Color(108, 122, 137));
        Mobiletxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Mobiletxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MobiletxtKeyTyped(evt);
            }
        });

        addresstxt.setBackground(new java.awt.Color(108, 122, 137));
        addresstxt.setColumns(20);
        addresstxt.setRows(5);
        jScrollPane1.setViewportView(addresstxt);

        Resetbtn.setBackground(new java.awt.Color(242, 38, 19));
        Resetbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Resetbtn.setForeground(new java.awt.Color(255, 255, 255));
        Resetbtn.setText("CANCEL");
        Resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetbtnActionPerformed(evt);
            }
        });

        submitbtn.setBackground(new java.awt.Color(34, 167, 240));
        submitbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submitbtn.setForeground(new java.awt.Color(255, 255, 255));
        submitbtn.setText("UPDATE");
        submitbtn.setEnabled(false);
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });

        idchkbtn.setBackground(new java.awt.Color(34, 167, 240));
        idchkbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        idchkbtn.setForeground(new java.awt.Color(255, 255, 255));
        idchkbtn.setText("Check");
        idchkbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idchkbtnActionPerformed(evt);
            }
        });

        mobchkbtn.setBackground(new java.awt.Color(34, 167, 240));
        mobchkbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mobchkbtn.setForeground(new java.awt.Color(255, 255, 255));
        mobchkbtn.setText("Check");
        mobchkbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobchkbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Addresslbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Emaillbl, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                        .addComponent(submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Mobilelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(IDlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Fnamelb, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nametxt)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(idchkbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Mobiletxt, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                .addComponent(mobchkbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDlbl)
                    .addComponent(Idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idchkbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mobiletxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mobilelbl)
                    .addComponent(mobchkbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fnamelb)
                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Addresslbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Emaillbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        this.dispose();
    }//GEN-LAST:event_ResetbtnActionPerformed

    private void idchkbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idchkbtnActionPerformed
        if(idchkbtn.getText().equals("Reset"))
        {
            Idtxt.setEditable(true);
            Mobiletxt.setEditable(true);
            idchkbtn.setText("Check");
            mobchkbtn.setText("Check");
            submitbtn.setEnabled(false);
            
            Idtxt.setText("");
            Mobiletxt.setText("");
            nametxt.setText("");
            addresstxt.setText("");
            emailtxt.setText("");
        }
        else if(cus.isCustomerIdExists(Idtxt.getText()))
        {
            ResultSet rs = cus.searchById(Idtxt.getText());
            Idtxt.setEditable(false);
            Mobiletxt.setEditable(false);
            idchkbtn.setText("Reset");
            mobchkbtn.setText("Reset");
            submitbtn.setEnabled(true);
            try{
                while(rs.next())
                {
                    nametxt.setText(rs.getString("name"));
                    addresstxt.setText(rs.getString("address"));
                    emailtxt.setText(rs.getString("email"));
                    Mobiletxt.setText(rs.getString("mobile"));
                }
            }
            catch(SQLException e)
        {
            EventLog.Write("Exception : "+e.getMessage());
        }

            
        }
        else
        {
            Idtxt.setEditable(true);
            Mobiletxt.setEditable(true);
            submitbtn.setEnabled(false);
            nametxt.setText("");
            addresstxt.setText("");
            emailtxt.setText("");
            Mobiletxt.setText("");
            MessageBox.infoBox("ID Does not exists.", "Not found");
            Idtxt.setText("");
        }
    }//GEN-LAST:event_idchkbtnActionPerformed

    private void mobchkbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobchkbtnActionPerformed
        if(idchkbtn.getText().equals("Reset"))
        {
            Idtxt.setEditable(true);
            Mobiletxt.setEditable(true);
            idchkbtn.setText("Check");
            mobchkbtn.setText("Check");
            submitbtn.setEnabled(false);
            
            Idtxt.setText("");
            Mobiletxt.setText("");
            nametxt.setText("");
            addresstxt.setText("");
            emailtxt.setText("");
        }
        else if(cus.isMobileExists(Mobiletxt.getText()))
        {
            ResultSet rs = cus.searchByMobile(Mobiletxt.getText());
            Idtxt.setEditable(false);
            Mobiletxt.setEditable(false);
            idchkbtn.setText("Reset");
            mobchkbtn.setText("Reset");
            submitbtn.setEnabled(true);
            try{
                while(rs.next())
                {
                    Idtxt.setText(rs.getString("id"));
                    nametxt.setText(rs.getString("name"));
                    addresstxt.setText(rs.getString("address"));
                    emailtxt.setText(rs.getString("email"));
                }
            }
            catch(SQLException e)
            {
                EventLog.Write("Exception : "+e.getMessage());
            }
  
        }
        else
        {
            Idtxt.setEditable(true);
            Mobiletxt.setEditable(true);
            submitbtn.setEnabled(false);
            Mobiletxt.setText("");
            nametxt.setText("");
            addresstxt.setText("");
            emailtxt.setText("");
            MessageBox.infoBox("Can not find the number", "Not found");
            Idtxt.setText("");
        }
    }//GEN-LAST:event_mobchkbtnActionPerformed

    private void MobiletxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MobiletxtKeyTyped
        boolean max = Mobiletxt.getText().length() > 9;
        if ( max )
            evt.consume(); 
    }//GEN-LAST:event_MobiletxtKeyTyped

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
         {                                          
        if(!(nametxt.getText().equals("") || addresstxt.getText().equals("")))
        {
            cus.setCus_name(nametxt.getText());
            cus.setCus_address(addresstxt.getText());
            cus.setCus_email(emailtxt.getText());
            cus.setCus_id(Integer.parseInt(Idtxt.getText()));
                        
            
            if(cus.updateCustomer())
            { 
                    MessageBox.infoBox("Update Completed.", "Success");
                    ResetbtnActionPerformed(evt);
                    Idtxt.setText("");
                    Mobiletxt.setText("");
                    Idtxt.setEditable(true);
                    Mobiletxt.setEditable(true);
            }
            else 
                MessageBox.infoBox("Please try again. If this issue presists please contact admin.", "Something Went Wrong!!!");  
        }
        else MessageBox.infoBox("Please fill all the required information.", "Fill required fields");  
    } 
    }//GEN-LAST:event_submitbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Updatecustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Updatecustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Updatecustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Updatecustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Updatecustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Addresslbl;
    private javax.swing.JLabel Emaillbl;
    private javax.swing.JLabel Fnamelb;
    private javax.swing.JLabel IDlbl;
    private javax.swing.JTextField Idtxt;
    private javax.swing.JLabel Mobilelbl;
    private javax.swing.JTextField Mobiletxt;
    private javax.swing.JButton Resetbtn;
    private javax.swing.JTextArea addresstxt;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JButton idchkbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mobchkbtn;
    private javax.swing.JTextField nametxt;
    private javax.swing.JButton submitbtn;
    // End of variables declaration//GEN-END:variables
}
