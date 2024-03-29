/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import Frontend.MessageBox;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Prashan
 */
public class Fee {
    
    private int fee_id=0;
    private String vehtype=null;
    private double fee=0;
    
    private final Connection con = dbConnection.CreateConn();
    
    public String[] getTypes()
    {
        try
        {
            String query = "SELECT veh_type FROM fee";
            String res[] = new String[10];

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            int i = 0;

            while(rs.next()) {
                res[i] = rs.getString("veh_type");
                i++;
            }
            return res;
        }
        catch (SQLException e)
            {
              System.err.println("Got an exception!");
              System.err.println(e.getMessage());
              return null;
            }
    }
    
    public boolean updateFee()
    {
        if(getFee()!=0 && getVehtype()!=null)
        {
        try
        {       
            String query = "UPDATE fee SET fee = ? WHERE veh_type = ?";

            //using a prepared statement to preven SQL Injection and other simillar attacks
            PreparedStatement prest = con.prepareStatement(query);
            prest.setDouble (1, getFee());
            prest.setString (2, getVehtype());

            // prepared statement execution
            prest.executeUpdate();
            EventLog.Write(getVehtype() + " Changed to : Rs."+ getFee());

            return true;
        }
        catch (SQLException e)
            {
              EventLog.Write("updateFee Exception : "+e.getMessage());
              return false;
            }
        }
        else return false;
    }
      
    
    public int getLastid() 
    {
        int id = 0;
        
        String sql = "SELECT id FROM fee WHERE id = (SELECT MAX(id) FROM fee)";
        try{
        Statement st = con.createStatement();
        
        ResultSet rs = st.executeQuery(sql);
        
        
        
        while (rs.next())
            {
              id = rs.getInt("id");       
            }
        st.close();
        }
        catch(SQLException e)
        {
            EventLog.Write("Exception : "+e.getMessage());
            MessageBox.infoBox("Something went wrong", "Error");
        }
        return id;
    }
    
    public int getIdByType() 
    {
        String sql = "SELECT fee.id FROM fee WHERE fee.veh_type='"+getVehtype()+"'";
        int id=0;
          try{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next())
        {
            id = rs.getInt("id");
        }
        return id;
        }
          catch(SQLException e)
        {
            EventLog.Write("Fee.getIdByType Exception : "+e.getMessage());
            return id;
        } 
    }
    
    public String getFeeByType(String Type) 
    {
        String sql = "SELECT fee FROM fee WHERE fee.veh_type='"+Type+"'";
          try{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next())
        {
            return Double.toString(rs.getDouble("fee"));
        }
        return null;
        }
          catch(SQLException e)
        {
            EventLog.Write("Fee.getFeeByType Exception : "+e.getMessage());
            MessageBox.infoBox("Error", "Process Failed");
            return null;
        } 
    }

    /**
     * @return the fee_id
     */
    public int getFee_id() {
        return fee_id;
    }

    /**
     * @param fee_id the fee_id to set
     */
    public void setFee_id(int fee_id) {
        this.fee_id = fee_id;
    }

    /**
     * @return the vehtype
     */
    public String getVehtype() {
        return vehtype;
    }

    /**
     * @param vehtype the vehtype to set
     */
    public void setVehtype(String vehtype) {
        this.vehtype = vehtype;
    }

    /**
     * @return the fee
     */
    public double getFee() {
        return fee;
    }

    /**
     * @param fee the fee to set
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    
}
