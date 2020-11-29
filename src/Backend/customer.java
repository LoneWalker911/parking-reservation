/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Prashan
 */
public class customer {
    private int cus_id = 0;
    private String cus_name = null;
    private String cus_mobile = null;
    private String cus_email = "";
    private String cus_address = "";
    private String password = null;
    EventLog log = new EventLog();
    private static final Connection con = dbConnection.CreateConn();

    public boolean addCustomer()
    {
        if(getCus_mobile()!=null && getCus_name() != null && getPassword() != null)
        {
        try
        {
            setCus_id(getLastid()+1);
            String query = "INSERT INTO customer (id, name, password, mobile, address, email) "
                         + " values (?, ?, ?, ?, ?, ?)";

            //using a prepared statement to preven SQL Injection and other simillar attacks
            PreparedStatement prest = con.prepareStatement(query);
            prest.setInt (1, getCus_id());
            prest.setString (2, getCus_name());
            prest.setString (3, getPassword());
            prest.setString (4, getCus_mobile());
            prest.setString (5, getCus_address());
            prest.setString (6, getCus_email());

            // prepared statement execution
            prest.execute();
            EventLog.Write("Customer_ID : " + getCus_id() + " added to customer table.");
            return true;
        }
        catch (SQLException e)
            {
              EventLog.Write("backend.customer Exception: " + e.getMessage());
              return false;
            }
        }
        else return false;
    }
    
    public ResultSet getCustomers()
    {
        try
        {
            int id = getLastid();
            String query = "SELECT * FROM customer WHERE email!='removed'";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            return rs;

        }
        catch (SQLException e)
            {
              System.err.println("Exception occured!");
              return null;
            }
    }
    
    public int getLastid()
    {
        int id = 0;
        
        String sql = "SELECT id FROM customer WHERE id = (SELECT MAX(id) FROM customer)";
        
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next())
            {
                id = rs.getInt("id");
            } }
        catch(SQLException e)
        {
            EventLog.Write("Exception : "+e.getMessage());
        }
      
      return id;
    }
    
    public boolean isCustomerIdExists(String id)
    {
        String sql = "SELECT id FROM customer WHERE id="+id+"' AND email!='removed'";
          try{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        return rs.next();
        }
          catch(SQLException e)
        {
            EventLog.Write("Customer.isCustomerIdExists Exception : "+e.getMessage());
            return false;
        }
    }
    
    public int getIdbyMobile(String mobile)
    {
        int id = 0;
        String sql;
        sql = "SELECT id FROM customer WHERE mobile="+"'"+mobile+"' AND email!='removed'";

        try{

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next())
          {
            id = rs.getInt("id");       
          }
          return id;
        }
        catch (SQLException e)
            {
              System.err.println("GetRole id Got an exception!+\n"+ sql );
              System.err.println(e.getMessage());
              return id;
            }
    }
        
    public static String getMobilebyId(int id)
    {
        String sql;
        sql = "SELECT mobile FROM customer WHERE id="+id+"' AND email!='removed'";

        try{

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next())
          {
            return rs.getString("mobile");       
          }
          return null;
        }
        catch (SQLException e)
            {
              System.err.println("GetRole id Got an exception!+\n"+ sql );
              System.err.println(e.getMessage());
              return null;
            }

    }
    
    public boolean changePassword(){
        String sql = "UPDATE customer SET password= ? WHERE mobile= ? ";
        try{
            PreparedStatement preparedStmt = con.prepareStatement(sql);
            preparedStmt.setString(1, getPassword());
            preparedStmt.setString(2, getCus_mobile());

            // execute the java preparedstatement
            preparedStmt.executeUpdate();
            return true;
        }
        catch(SQLException e)
        {
            EventLog.Write("Exception in customer.changePassword : "+e.getMessage());
            return false;
        }
    }
    
    public boolean isMobileExists(String mobile)
    {
        String sql = "SELECT mobile FROM customer WHERE mobile='" + mobile + "' AND email!='removed'";
        boolean ret = false;
        try{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        ret = rs.next();
        rs.close();
        return ret;
        }
        catch(SQLException e){
            EventLog.Write("Exception : "+e.getMessage());
        }
        return ret;
    }
    
    public ResultSet searchById(String id) 
    {
        String sql = "SELECT name, mobile, address, email FROM customer WHERE id="+id+" AND email!='removed'";
          try{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        return rs;
        }
          catch(SQLException e)
        {
            EventLog.Write("Exception : "+e.getMessage());
            return null;
        } 
    }
    
    public ResultSet searchByMobile(String mobile) 
    {
        String sql = "SELECT id, name, address, email FROM customer WHERE mobile='" + mobile + "' AND email!='removed'";
          try{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        return rs;
        }
          catch(SQLException e)
        {
            EventLog.Write("Exception : "+e.getMessage());
            return null;
        } 
    }
    
    public boolean updateCustomer()
    {
        if(getCus_id()!=0 && getCus_name()!=null && getCus_address()!=null)
        {
        try
        {       
            String query = "UPDATE customer SET name = ?, address = ?, email = ? WHERE id = ?";

            //using a prepared statement to preven SQL Injection and other simillar attacks
            PreparedStatement prest = con.prepareStatement(query);
            prest.setString (1, getCus_name());
            prest.setString (2, getCus_address());
            prest.setString (3, getCus_email());
            prest.setInt (4, getCus_id());

            // prepared statement execution
            prest.executeUpdate();
            EventLog.Write("Customer_ID : "+ getCus_id() +" updated.");

            return true;
        }
        catch (SQLException e)
            {
              EventLog.Write("updateCustomer Exception : "+e.getMessage());
              return false;
            }
        }
        else return false;
    }
    
    public boolean removeCustomer()
    {
        if(getCus_id()!=0)
        {
        try
        {       
            String query = "UPDATE customer SET email='removed' WHERE id = ?";

            //using a prepared statement to preven SQL Injection and other simillar attacks
            PreparedStatement prest = con.prepareStatement(query);
            prest.setInt (1, getCus_id());
            
            // prepared statement execution
            prest.executeUpdate();
            EventLog.Write("Customer_ID : "+ getCus_id()+" removed.");

            return true;
        }
        catch (SQLException e)
            {
              EventLog.Write("removeCustomer Exception : "+e.getMessage());
              return false;
            }
        }
        else return false;
    }
    
    public int Login()
    {
        try {
            String sql = "SELECT id FROM customer WHERE mobile='" + getCus_mobile() + "' AND password='" + getPassword() + "' AND email!='removed'";
            
            Statement st = con.createStatement();
            
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next())
            {
                return rs.getInt("id");
            }
            
  
        } catch (SQLException e) {
            EventLog.Write("cus_login exception : "+e.getMessage());
            return 0;
        }
    
        return 0;
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

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
