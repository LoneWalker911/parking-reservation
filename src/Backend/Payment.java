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
import java.util.concurrent.TimeUnit;

/**
 *
 * @author thisa
 */


public class Payment {
    
    private int resv_id=0;
    private int id=0;
    private String pg_id=null;
    private String method=null;
    private String mobile=null;
    private String address=null;

    private final static Connection con = dbConnection.CreateConn();
    EventLog log = new EventLog();
    
    public boolean cashPay(int res_id)
    {
        if(Reserve.getStatusbyId(res_id).equals("PENDING"))
        {
        try
        {       
            String query = "INSERT INTO payment (reservation_id, amount, status_code, method) "
                    + "VALUES (?, ?, 2, 'CASH')";

            //using a prepared statement to preven SQL Injection and other simillar attacks
            PreparedStatement prest = con.prepareStatement(query);
            prest.setInt (1, res_id);
            prest.setDouble (2, Reserve.getAmountbyId(res_id));
            

            // execute the preparedstatement
            prest.execute();
            EventLog.Write("Payment for Reservation "+res_id+ ".");

            return true;
        }
        catch (SQLException e)
            {
              System.err.println("addStaff Got an exception!");
              System.err.println(e.toString());
              return false;
            }
        }
        else
            return false;
        
    }
    
    
    public ResultSet searchPayment(String id,String order_id, String pg_id) 
    {
        String sql = "SELECT * FROM payment WHERE id LIKE ? AND reservation_id LIKE ? AND pg_payment_id LIKE ? LIMIT 20";
        try{
                //using a prepared statement to preven SQL Injection and other simillar attacks
                PreparedStatement prest = con.prepareStatement(sql);
                prest.setString (1, "%"+id+"%");
                prest.setString (2, "%"+order_id+"%");
                prest.setString (3, "%"+pg_id+"%");
               
                ResultSet rs = prest.executeQuery();
                return rs;
            }
          catch(SQLException e)
        {
            EventLog.Write("searchPayment Exception : "+e.getMessage());
            return null;
        } 
    }
        
    
    public static boolean isResvIdExists(int id)
    {
        String sql = "SELECT reservation_id FROM payment WHERE reservation_id="+id;
          try{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        return rs.next();
        }
          catch(SQLException e)
        {
            EventLog.Write("Payment.isResvIdExists Exception : "+e.getMessage());
            return false;
        }
    }
    

    public int getResv_id() {
        return resv_id;
    }


    public void setResv_id(int resv_id) {
        this.resv_id = resv_id;
    }



    public String getPg_id() {
        return pg_id;
    }


    public void setPg_id(String pg_id) {
        this.pg_id = pg_id;
    }


    public String getMethod() {
        return method;
    }


    public void setMethod(String method) {
        this.method = method;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
       
}
