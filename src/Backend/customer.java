/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Prashan
 */
public class customer {
    private int cus_id;
    private String cus_name;
    private String cus_mobile;
    private String cus_email;
    private String cus_address;
    dbConnection db = new dbConnection();
    private final Connection con = db.CreateConn();

    
    public int getLastid() throws SQLException
    {
        int id = -1;
        
        String sql = "SELECT id FROM roles WHERE id = (SELECT MAX(id) FROM roles)";
        
        Statement st = con.createStatement();
        
        ResultSet rs = st.executeQuery(sql);
        
        while (rs.next())
      {
        id = rs.getInt("id");       
      }
      st.close();
      con.close();
      
      return id;
    }
    
    /**
     * @return the cus_id
     */
    public int getCus_id() {
        return cus_id;
    }

    /**
     * @param cus_id the cus_id to set
     */
    public void setCus_id(int cus_id) {
        this.cus_id = cus_id;
    }

    /**
     * @return the cus_name
     */
    public String getCus_name() {
        return cus_name;
    }

    /**
     * @param cus_name the cus_name to set
     */
    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    /**
     * @return the cus_mobile
     */
    public String getCus_mobile() {
        return cus_mobile;
    }

    /**
     * @param cus_mobile the cus_mobile to set
     */
    public void setCus_mobile(String cus_mobile) {
        this.cus_mobile = cus_mobile;
    }

    /**
     * @return the cus_email
     */
    public String getCus_email() {
        return cus_email;
    }

    /**
     * @param cus_email the cus_email to set
     */
    public void setCus_email(String cus_email) {
        this.cus_email = cus_email;
    }

    /**
     * @return the cus_address
     */
    public String getCus_address() {
        return cus_address;
    }

    /**
     * @param cus_address the cus_address to set
     */
    public void setCus_address(String cus_address) {
        this.cus_address = cus_address;
    }
    
    
}
