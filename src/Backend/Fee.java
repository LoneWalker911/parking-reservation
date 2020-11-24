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
    private String vehtype="";
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
    
    public int getIdByType(String type) 
    {
        String sql = "SELECT fee.id FROM fee WHERE fee.veh_type='"+type+"'";
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
            EventLog.Write("Exception : "+e.getMessage());
            return id;
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
