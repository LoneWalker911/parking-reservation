/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend.Staff;
import Backend.Role;
import Backend.EventLog;
import Frontend.MessageBox;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author thisa
 */
public class updatestaff extends javax.swing.JFrame {

    /**
     * Creates new form AddStaff
     */
    Backend.Staff stf = new Backend.Staff();
    Backend.Login login = new Backend.Login();
    Role rl = new Role();
    String[] res = new String[10];
    
    public updatestaff() {
        initComponents();

        res = rl.getRoles();
        int i = 0;
             do{
              rolecombo.addItem(res[i]);
              i++;
            }while(!(res[i]==null));
    }
    
    public updatestaff(String user,String level){
        initComponents();
        
        res = rl.getRoles();
        int i = 0;
             do{
                rolecombo.addItem(res[i]);
                i++;
                }while(!(res[i]==null));
        if(!level.equals("admin"))
        {
            unametxt.setText(user);
            //Idtxt.setText(Integer.toString(stf.getIdByUsername(user)));
            unamechkbtnActionPerformed(null);
            Idtxt.setEditable(true);
            unametxt.setEditable(true);
            unamechkbtn.setEnabled(false);
            idchkbtn.setEnabled(false);
            Resetbtn.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        emailtxt = new javax.swing.JTextField();
        idchkbtn = new javax.swing.JButton();
        phonelbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addresstxt = new javax.swing.JTextArea();
        mobiletxt = new javax.swing.JTextField();
        IDlbl = new javax.swing.JLabel();
        Idtxt = new javax.swing.JTextField();
        submitbtn = new javax.swing.JButton();
        nameLbl = new javax.swing.JLabel();
        rolecombo = new javax.swing.JComboBox<>();
        nametxt = new javax.swing.JTextField();
        rolelbl = new javax.swing.JLabel();
        addresslbl = new javax.swing.JLabel();
        unamelbl = new javax.swing.JLabel();
        emaillbl = new javax.swing.JLabel();
        unametxt = new javax.swing.JTextField();
        Resetbtn = new javax.swing.JButton();
        unamechkbtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        label1.setText("label1");

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));

        emailtxt.setBackground(new java.awt.Color(108, 122, 137));
        emailtxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        idchkbtn.setBackground(new java.awt.Color(34, 167, 240));
        idchkbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        idchkbtn.setForeground(new java.awt.Color(255, 255, 255));
        idchkbtn.setText("Check");
        idchkbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idchkbtnActionPerformed(evt);
            }
        });

        phonelbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        phonelbl.setForeground(new java.awt.Color(236, 240, 241));
        phonelbl.setText("Mobile");

        addresstxt.setBackground(new java.awt.Color(108, 122, 137));
        addresstxt.setColumns(20);
        addresstxt.setRows(5);
        jScrollPane1.setViewportView(addresstxt);

        mobiletxt.setBackground(new java.awt.Color(108, 122, 137));
        mobiletxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mobiletxt.setToolTipText("Ex: 0788323221");
        mobiletxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mobiletxtKeyTyped(evt);
            }
        });

        IDlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        IDlbl.setForeground(new java.awt.Color(236, 240, 241));
        IDlbl.setText("ID :");

        Idtxt.setBackground(new java.awt.Color(108, 122, 137));
        Idtxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Idtxt.setToolTipText("Enter the staff id");
        Idtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdtxtActionPerformed(evt);
            }
        });
        Idtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IdtxtKeyPressed(evt);
            }
        });

        submitbtn.setBackground(new java.awt.Color(34, 167, 240));
        submitbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submitbtn.setForeground(new java.awt.Color(255, 255, 255));
        submitbtn.setText("Update");
        submitbtn.setEnabled(false);
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });

        nameLbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nameLbl.setForeground(new java.awt.Color(236, 240, 241));
        nameLbl.setText("Name");

        nametxt.setBackground(new java.awt.Color(108, 122, 137));
        nametxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        rolelbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rolelbl.setForeground(new java.awt.Color(236, 240, 241));
        rolelbl.setText("Role");

        addresslbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addresslbl.setForeground(new java.awt.Color(236, 240, 241));
        addresslbl.setText("Address");

        unamelbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        unamelbl.setForeground(new java.awt.Color(236, 240, 241));
        unamelbl.setText("Username");

        emaillbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        emaillbl.setForeground(new java.awt.Color(236, 240, 241));
        emaillbl.setText("Email");

        unametxt.setBackground(new java.awt.Color(108, 122, 137));
        unametxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        unametxt.setToolTipText("Ex: 0788323221");

        Resetbtn.setBackground(new java.awt.Color(242, 38, 19));
        Resetbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Resetbtn.setForeground(new java.awt.Color(255, 255, 255));
        Resetbtn.setText("RESET");
        Resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetbtnActionPerformed(evt);
            }
        });

        unamechkbtn.setBackground(new java.awt.Color(34, 167, 240));
        unamechkbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        unamechkbtn.setForeground(new java.awt.Color(255, 255, 255));
        unamechkbtn.setText("Check");
        unamechkbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unamechkbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(unamelbl)
                        .addGap(37, 37, 37)
                        .addComponent(unametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(unamechkbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addresslbl)
                            .addComponent(nameLbl)
                            .addComponent(emaillbl)
                            .addComponent(phonelbl))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailtxt)
                            .addComponent(mobiletxt)
                            .addComponent(nametxt)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(Resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(IDlbl)
                                .addComponent(rolelbl))
                            .addGap(89, 89, 89)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rolecombo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(Idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(idchkbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(68, 68, 68))))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDlbl)
                    .addComponent(idchkbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unamelbl)
                    .addComponent(unametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unamechkbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLbl))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addresslbl))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emaillbl)
                    .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phonelbl)
                    .addComponent(mobiletxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rolelbl)
                    .addComponent(rolecombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UPDATE STAFF MEMBER");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(138, 138, 138)
                    .addComponent(jLabel1)
                    .addContainerGap(174, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addGap(5, 5, 5)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mobiletxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobiletxtKeyTyped
        boolean max = mobiletxt.getText().length() > 9;
        if ( max )
            evt.consume();     
    }//GEN-LAST:event_mobiletxtKeyTyped

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
        if(!(nametxt.getText().equals("") || addresstxt.getText().equals("") || emailtxt.getText().equals("") || mobiletxt.getText().equals("") || rolecombo.getSelectedIndex() == -1))
        {
            stf.setName(nametxt.getText());
            stf.setAddress(addresstxt.getText());
            stf.setEmail(emailtxt.getText());
            stf.setMobile(mobiletxt.getText());
            stf.setUser_id(Integer.parseInt(Idtxt.getText()));
            
            login.setRole_id((rl.getId(String.valueOf(rolecombo.getSelectedItem()))));
            login.setStaff_id(Integer.parseInt(Idtxt.getText()));
            
            
            if(stf.updateStaff())
            { 
                if(login.changeRole())
                {
                    MessageBox.infoBox("Update Completed.", "Success");
                    ResetbtnActionPerformed(evt);
                }
                else
                {
                    MessageBox.infoBox("Staff details updated but Changing role failed.", "Failed");
                    ResetbtnActionPerformed(evt);
                }
            }
            else 
                MessageBox.infoBox("Please try again. If this issue presists please contact admin.", "Something Went Wrong!!!");  
        }
        else MessageBox.infoBox("Please fill all the required information.", "Fill required fields");  
    }//GEN-LAST:event_submitbtnActionPerformed

    private void idchkbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idchkbtnActionPerformed
        if(idchkbtn.getText().equals("Reset"))
        {
            Idtxt.setEditable(true);
            unametxt.setEditable(true);
            idchkbtn.setText("Check");
            unamechkbtn.setText("Check");
            submitbtn.setEnabled(false);
            
            Idtxt.setText("");
            unametxt.setText("");
            nametxt.setText("");
            addresstxt.setText("");
            emailtxt.setText("");
            mobiletxt.setText("");
            rolecombo.setSelectedIndex(-1);
        }
        else if(stf.isStaffIdExists(Idtxt.getText()))
        {
            ResultSet rs = stf.searchById(Idtxt.getText());
            Idtxt.setEditable(false);
            unametxt.setEditable(false);
            idchkbtn.setText("Reset");
            unamechkbtn.setText("Reset");
            submitbtn.setEnabled(true);
            try{
                while(rs.next())
                {
                    unametxt.setText(rs.getString("username"));
                    nametxt.setText(rs.getString("name"));
                    addresstxt.setText(rs.getString("address"));
                    emailtxt.setText(rs.getString("email"));
                    mobiletxt.setText(rs.getString("mobile"));
                    rolecombo.setSelectedItem(rs.getString("role"));
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
            unametxt.setEditable(true);
            submitbtn.setEnabled(false);
            unametxt.setText("");
            nametxt.setText("");
            addresstxt.setText("");
            emailtxt.setText("");
            mobiletxt.setText("");
            MessageBox.infoBox("ID Does not exists.", "Not found");
            Idtxt.setText("");
            rolecombo.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_idchkbtnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void IdtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdtxtActionPerformed

    private void ResetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetbtnActionPerformed

            idchkbtn.setText("Check");
            unamechkbtn.setText("Check");
            submitbtn.setEnabled(false);

            nametxt.setText("");
            addresstxt.setText("");
            emailtxt.setText("");
            mobiletxt.setText("");
            rolecombo.setSelectedIndex(-1);
    }//GEN-LAST:event_ResetbtnActionPerformed

    private void unamechkbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unamechkbtnActionPerformed
        if(idchkbtn.getText().equals("Reset"))
        {
            Idtxt.setEditable(true);
            unametxt.setEditable(true);
            idchkbtn.setText("Check");
            unamechkbtn.setText("Check");
            submitbtn.setEnabled(false);
            
            Idtxt.setText("");
            unametxt.setText("");
            nametxt.setText("");
            addresstxt.setText("");
            emailtxt.setText("");
            mobiletxt.setText("");
            rolecombo.setSelectedIndex(-1);
        }
        else if(login.isUsernameExists(unametxt.getText()))
        {
            ResultSet rs = stf.searchByUsername(unametxt.getText());
            Idtxt.setEditable(false);
            unametxt.setEditable(false);
            idchkbtn.setText("Reset");
            unamechkbtn.setText("Reset");
            submitbtn.setEnabled(true);
            try{
                while(rs.next())
                {
                    Idtxt.setText(rs.getString("id"));
                    nametxt.setText(rs.getString("name"));
                    addresstxt.setText(rs.getString("address"));
                    emailtxt.setText(rs.getString("email"));
                    mobiletxt.setText(rs.getString("mobile"));
                    rolecombo.setSelectedItem(rs.getString("role"));
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
            unametxt.setEditable(true);
            submitbtn.setEnabled(false);
            unametxt.setText("");
            nametxt.setText("");
            addresstxt.setText("");
            emailtxt.setText("");
            mobiletxt.setText("");
            MessageBox.infoBox("Username Does not exists.", "Not found");
            Idtxt.setText("");
            rolecombo.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_unamechkbtnActionPerformed

    private void IdtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdtxtKeyPressed
        String value = Idtxt.getText();
            int l = value.length();
            if (evt.getKeyChar() == '0' ) {
               evt.consume();
            } 
            
    }//GEN-LAST:event_IdtxtKeyPressed

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
            java.util.logging.Logger.getLogger(updatestaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updatestaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updatestaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updatestaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatestaff().setVisible(true);
                
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDlbl;
    private javax.swing.JTextField Idtxt;
    private javax.swing.JButton Resetbtn;
    private javax.swing.JLabel addresslbl;
    private javax.swing.JTextArea addresstxt;
    private javax.swing.JLabel emaillbl;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JButton idchkbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JTextField mobiletxt;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nametxt;
    private javax.swing.JLabel phonelbl;
    private javax.swing.JComboBox<String> rolecombo;
    private javax.swing.JLabel rolelbl;
    private javax.swing.JButton submitbtn;
    private javax.swing.JButton unamechkbtn;
    private javax.swing.JLabel unamelbl;
    private javax.swing.JTextField unametxt;
    // End of variables declaration//GEN-END:variables
}