/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend.Staff;


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
        ut=usertype;
        this.uname=uname;
        unamelbl.setText(uname);
        UserType.setText(ut);
        
    }
    public StaffIF() {
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

        addstaffbtn1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        tabpane = new javax.swing.JTabbedPane();
        mngstaffpanel = new javax.swing.JPanel();
        addstaffbtn = new javax.swing.JButton();
        changepswbtn = new javax.swing.JButton();
        searchstaffbtn = new javax.swing.JButton();
        removestaffbtn = new javax.swing.JButton();
        updatestaffbtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        deletecusbtn = new javax.swing.JButton();
        updatecusbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        slotaddbtn = new javax.swing.JButton();
        slotupdatebtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        resviewbtn = new javax.swing.JButton();
        resserchbtn = new javax.swing.JButton();
        respayementbtn = new javax.swing.JButton();
        resupdatebtn = new javax.swing.JButton();
        rescancelbtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        paysearchbtn = new javax.swing.JButton();
        payviewbtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        vehaddbtn = new javax.swing.JButton();
        vehremovebtn = new javax.swing.JButton();
        vehsearchbtn = new javax.swing.JButton();
        UserType = new javax.swing.JLabel();
        mngstaffbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        UTlbl = new javax.swing.JLabel();
        unamelbl = new javax.swing.JLabel();
        cusmngbtn = new javax.swing.JButton();
        vehiclebtn = new javax.swing.JButton();
        slotcontrolbtn = new javax.swing.JButton();
        reservbtn = new javax.swing.JButton();
        payemntbtn = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        staffexitbtn = new javax.swing.JButton();

        addstaffbtn1.setText("ADD STAFF MEMBER");
        addstaffbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addstaffbtn1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel8.setBackground(new java.awt.Color(44, 62, 80));

        tabpane.setBackground(new java.awt.Color(44, 62, 80));
        tabpane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabpane.setForeground(new java.awt.Color(236, 240, 241));
        tabpane.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        mngstaffpanel.setMaximumSize(null);
        mngstaffpanel.setName(""); // NOI18N

        addstaffbtn.setBackground(new java.awt.Color(0, 255, 127));
        addstaffbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addstaffbtn.setText("ADD STAFF MEMBER");
        addstaffbtn.setMaximumSize(null);
        addstaffbtn.setMinimumSize(null);
        addstaffbtn.setName(""); // NOI18N
        addstaffbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addstaffbtnActionPerformed(evt);
            }
        });

        changepswbtn.setBackground(new java.awt.Color(0, 255, 127));
        changepswbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        changepswbtn.setText("CHANGE PASSWORD");
        changepswbtn.setMaximumSize(null);
        changepswbtn.setMinimumSize(null);
        changepswbtn.setName(""); // NOI18N
        changepswbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepswbtnActionPerformed(evt);
            }
        });

        searchstaffbtn.setBackground(new java.awt.Color(0, 255, 127));
        searchstaffbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchstaffbtn.setText("SEARCH STAFF");
        searchstaffbtn.setMaximumSize(null);
        searchstaffbtn.setMinimumSize(null);
        searchstaffbtn.setName(""); // NOI18N

        removestaffbtn.setBackground(new java.awt.Color(0, 255, 127));
        removestaffbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        removestaffbtn.setText("REMOVE STAFF");
        removestaffbtn.setMaximumSize(null);
        removestaffbtn.setMinimumSize(null);
        removestaffbtn.setName(""); // NOI18N

        updatestaffbtn.setBackground(new java.awt.Color(0, 255, 127));
        updatestaffbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updatestaffbtn.setText("UPDATE STAFF");
        updatestaffbtn.setMaximumSize(null);
        updatestaffbtn.setMinimumSize(null);
        updatestaffbtn.setName(""); // NOI18N
        updatestaffbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatestaffbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mngstaffpanelLayout = new javax.swing.GroupLayout(mngstaffpanel);
        mngstaffpanel.setLayout(mngstaffpanelLayout);
        mngstaffpanelLayout.setHorizontalGroup(
            mngstaffpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mngstaffpanelLayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addGroup(mngstaffpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(removestaffbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatestaffbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changepswbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchstaffbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addstaffbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(258, Short.MAX_VALUE))
        );
        mngstaffpanelLayout.setVerticalGroup(
            mngstaffpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mngstaffpanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(addstaffbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(searchstaffbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(changepswbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(updatestaffbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(removestaffbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        tabpane.addTab("STAFF", null, mngstaffpanel, "");

        deletecusbtn.setBackground(new java.awt.Color(0, 255, 127));
        deletecusbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deletecusbtn.setText("DELETE CUSROMER");

        updatecusbtn.setBackground(new java.awt.Color(0, 255, 127));
        updatecusbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updatecusbtn.setText("UPDATE CUSTOMER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(updatecusbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(deletecusbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(258, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(updatecusbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(deletecusbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(320, Short.MAX_VALUE))
        );

        tabpane.addTab("CUSTOMER", jPanel1);

        slotaddbtn.setBackground(new java.awt.Color(0, 255, 127));
        slotaddbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        slotaddbtn.setText("ADD");

        slotupdatebtn.setBackground(new java.awt.Color(0, 255, 127));
        slotupdatebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        slotupdatebtn.setText("UPDATE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slotupdatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slotaddbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(253, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(slotaddbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(slotupdatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(313, Short.MAX_VALUE))
        );

        tabpane.addTab("SLOT", jPanel2);

        resviewbtn.setBackground(new java.awt.Color(0, 255, 127));
        resviewbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resviewbtn.setText("VIEW");

        resserchbtn.setBackground(new java.awt.Color(0, 255, 127));
        resserchbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resserchbtn.setText("SEARCH");

        respayementbtn.setBackground(new java.awt.Color(0, 255, 127));
        respayementbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        respayementbtn.setText("PAYMENT");

        resupdatebtn.setBackground(new java.awt.Color(0, 255, 127));
        resupdatebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resupdatebtn.setText("UPDATE");
        resupdatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resupdatebtnActionPerformed(evt);
            }
        });

        rescancelbtn.setBackground(new java.awt.Color(0, 255, 127));
        rescancelbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rescancelbtn.setText("CANCEL");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rescancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resviewbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resserchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resupdatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(respayementbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(253, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(resviewbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(resserchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(resupdatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(respayementbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(rescancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        tabpane.addTab("RESERVATION", jPanel3);

        paysearchbtn.setBackground(new java.awt.Color(0, 255, 127));
        paysearchbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        paysearchbtn.setText("SEARCH");

        payviewbtn.setBackground(new java.awt.Color(0, 255, 127));
        payviewbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        payviewbtn.setText("VIEW");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(payviewbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paysearchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(253, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(paysearchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(payviewbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(307, Short.MAX_VALUE))
        );

        tabpane.addTab("PAYEMNT", jPanel5);

        vehaddbtn.setBackground(new java.awt.Color(0, 255, 127));
        vehaddbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        vehaddbtn.setText("ADD");

        vehremovebtn.setBackground(new java.awt.Color(0, 255, 127));
        vehremovebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        vehremovebtn.setText("REMOVE");

        vehsearchbtn.setBackground(new java.awt.Color(0, 255, 127));
        vehsearchbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        vehsearchbtn.setText("SEARCH");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vehsearchbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(vehremovebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(vehaddbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(253, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(vehaddbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(vehremovebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(vehsearchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        tabpane.addTab("VEHICLE", jPanel4);

        UserType.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UserType.setForeground(new java.awt.Color(236, 240, 241));
        UserType.setText("Usertype");

        mngstaffbtn.setBackground(new java.awt.Color(34, 167, 240));
        mngstaffbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mngstaffbtn.setText("MANAGE STAFF");
        mngstaffbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngstaffbtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(236, 240, 241));
        jLabel1.setText("Username : ");

        UTlbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UTlbl.setForeground(new java.awt.Color(236, 240, 241));
        UTlbl.setText("Staff Level : ");

        unamelbl.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        unamelbl.setForeground(new java.awt.Color(236, 240, 241));
        unamelbl.setText("Username");

        cusmngbtn.setBackground(new java.awt.Color(34, 167, 240));
        cusmngbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cusmngbtn.setText("CUSTOMER MANAGEMENT");
        cusmngbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusmngbtnActionPerformed(evt);
            }
        });

        vehiclebtn.setBackground(new java.awt.Color(34, 167, 240));
        vehiclebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        vehiclebtn.setText("VEHICLE ");
        vehiclebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehiclebtnActionPerformed(evt);
            }
        });

        slotcontrolbtn.setBackground(new java.awt.Color(34, 167, 240));
        slotcontrolbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        slotcontrolbtn.setText("SLOT CONTROL");
        slotcontrolbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slotcontrolbtnActionPerformed(evt);
            }
        });

        reservbtn.setBackground(new java.awt.Color(34, 167, 240));
        reservbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reservbtn.setText("RESERVATION");
        reservbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservbtnActionPerformed(evt);
            }
        });

        payemntbtn.setBackground(new java.awt.Color(34, 167, 240));
        payemntbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        payemntbtn.setText("PAYEMENT");
        payemntbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payemntbtnActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(248, 148, 6));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("STAFF");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(448, 448, 448))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        staffexitbtn.setBackground(new java.awt.Color(242, 38, 19));
        staffexitbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        staffexitbtn.setText("EXIT");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(UTlbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UserType))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unamelbl))
                    .addComponent(cusmngbtn)
                    .addComponent(mngstaffbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slotcontrolbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reservbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vehiclebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payemntbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(staffexitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabpane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserType)
                            .addComponent(UTlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(unamelbl))
                        .addGap(31, 31, 31)
                        .addComponent(mngstaffbtn)
                        .addGap(30, 30, 30)
                        .addComponent(cusmngbtn)
                        .addGap(30, 30, 30)
                        .addComponent(slotcontrolbtn)
                        .addGap(30, 30, 30)
                        .addComponent(reservbtn)
                        .addGap(30, 30, 30)
                        .addComponent(vehiclebtn)
                        .addGap(30, 30, 30)
                        .addComponent(payemntbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(staffexitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tabpane, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mngstaffbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngstaffbtnActionPerformed
        tabpane.setSelectedIndex(0);
            
            
        
    }//GEN-LAST:event_mngstaffbtnActionPerformed

    private void changepswbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepswbtnActionPerformed
        ChangeStaffPassword newpsw = new ChangeStaffPassword(uname,ut);
        newpsw.setVisible(true);
    }//GEN-LAST:event_changepswbtnActionPerformed

    private void addstaffbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addstaffbtnActionPerformed
        AddStaff stf = new AddStaff();
        stf.setVisible(true);
    }//GEN-LAST:event_addstaffbtnActionPerformed

    private void cusmngbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusmngbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusmngbtnActionPerformed

    private void vehiclebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehiclebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehiclebtnActionPerformed

    private void slotcontrolbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slotcontrolbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_slotcontrolbtnActionPerformed

    private void reservbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reservbtnActionPerformed

    private void payemntbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payemntbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payemntbtnActionPerformed

    private void addstaffbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addstaffbtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addstaffbtn1ActionPerformed

    private void resupdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resupdatebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resupdatebtnActionPerformed

    private void updatestaffbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatestaffbtnActionPerformed
        Frontend.Staff.updatestaff upstf = new Frontend.Staff.updatestaff(uname,ut);
        upstf.setVisible(true);
    }//GEN-LAST:event_updatestaffbtnActionPerformed

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
    private javax.swing.JButton cusmngbtn;
    private javax.swing.JButton deletecusbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton mngstaffbtn;
    private javax.swing.JPanel mngstaffpanel;
    private javax.swing.JButton payemntbtn;
    private javax.swing.JButton paysearchbtn;
    private javax.swing.JButton payviewbtn;
    private javax.swing.JButton removestaffbtn;
    private javax.swing.JButton rescancelbtn;
    private javax.swing.JButton reservbtn;
    private javax.swing.JButton respayementbtn;
    private javax.swing.JButton resserchbtn;
    private javax.swing.JButton resupdatebtn;
    private javax.swing.JButton resviewbtn;
    private javax.swing.JButton searchstaffbtn;
    private javax.swing.JButton slotaddbtn;
    private javax.swing.JButton slotcontrolbtn;
    private javax.swing.JButton slotupdatebtn;
    private javax.swing.JButton staffexitbtn;
    private javax.swing.JTabbedPane tabpane;
    private javax.swing.JLabel unamelbl;
    private javax.swing.JButton updatecusbtn;
    private javax.swing.JButton updatestaffbtn;
    private javax.swing.JButton vehaddbtn;
    private javax.swing.JButton vehiclebtn;
    private javax.swing.JButton vehremovebtn;
    private javax.swing.JButton vehsearchbtn;
    // End of variables declaration//GEN-END:variables
}
