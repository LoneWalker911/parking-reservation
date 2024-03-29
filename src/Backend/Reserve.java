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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author thisa
 */
public class Reserve {
    private int id=0;
    private int cus_id=0;
    private int slot_id=0;
    private int veh_id=0;
    private int fee_id=0;
    private int duration=0;
    private Date stdate=null;
    private Date endate=null;
    private String status="";
    
    private final static Connection con = dbConnection.CreateConn();
    EventLog log = new EventLog();
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public int Create()
    {
        if(getCus_id()!=0 && getSlot_id()!=0 && getVeh_id()!=0 && getFee_id()!=0 && getDuration()!=0 && getStdate()!=null && getEndate()!=null && !getStatus().equals(""))
        {
            int id = getLastid()+1;
            
        try
        {       
            String query = "INSERT INTO reservation "
                         + " values (?, ?, ?, ?, ?, ?, (SELECT fee*? FROM fee WHERE fee.id=?), ?, ?, ?)";

            //using a prepared statement to preven SQL Injection and other simillar attacks
            PreparedStatement prest = con.prepareStatement(query);
            prest.setInt (1, id);
            prest.setInt (2, getCus_id());
            prest.setInt (3, getSlot_id());
            prest.setInt (4, getVeh_id());
            prest.setInt (5, getFee_id());
            prest.setInt (6, getDuration());
            prest.setInt (7, getDuration());
            prest.setInt (8, getFee_id());
            prest.setString (9, dateFormat.format(getStdate()));
            prest.setString (10, dateFormat.format(getEndate()));
            prest.setString (11, getStatus());

            //execute the preparedstatement
            prest.execute();
            EventLog.Write("Resertion_ID : "+ id + " added. status: "+getStatus());

            return id;
        }
        catch (SQLException e)
            {
              EventLog.Write("CreateReservation Got an exception!\n"+e.toString());
              System.err.println(e.toString());
              return 0;
            }
        }
        else return 0;
    }
    
    public boolean Cancel()
    {
        if(getId()!=0)
        {
            
        try
        {       
            String query = "UPDATE reservation SET status='CANCELLED' WHERE id=?";

            //using a prepared statement to preven SQL Injection and other simillar attacks
            PreparedStatement prest = con.prepareStatement(query);
            prest.setInt (1, getId());

            //execute the preparedstatement
            prest.executeUpdate();
            
            
            
            EventLog.Write("Resertion_ID : "+ getId() + " calcelled. status: CANCELLED");
            
            return getStatusbyId(getId()).equals("CANCELLED");
        }
        catch (SQLException e)
            {
              EventLog.Write("CancelReservation Got an exception!\n"+e.toString());
              System.err.println(e.toString());
              return false;
            }
        }
        else return false;
    }
    
    public boolean setReserve()
    {
        if(getId()!=0 && Payment.isResvIdExists(getId()))
        {
            
        try
        {       
            String query = "UPDATE reservation SET status='RESERVED' WHERE id=?";

            //using a prepared statement to preven SQL Injection and other simillar attacks
            PreparedStatement prest = con.prepareStatement(query);
            prest.setInt (1, getId());

            //execute the preparedstatement
            prest.executeUpdate();
            EventLog.Write("Resertion_ID : "+ getId() + " reserved. status: RESERVED");

            return true;
        }
        catch (SQLException e)
            {
              EventLog.Write("setReserve Got an exception!\n"+e.toString());
              System.err.println(e.toString());
              return false;
            }
        }
        else return false;
    }
    
    public int[] checkDates()
    {
        String sql = "SELECT parking_slot.id FROM parking_slot WHERE NOT EXISTS "
                + "(SELECT 1 FROM reservation WHERE reservation.status!='CANCELLED' AND "
                + "( ('"+ dateFormat.format(getStdate()) +"'=reservation.start_date) OR ('"+ dateFormat.format(getStdate()) +"' BETWEEN reservation.start_date AND reservation.end_date) OR "
                + "('"+ dateFormat.format(getStdate()) +"' <= reservation.start_date AND '"+ dateFormat.format(getEndate()) +"' >= reservation.end_date) OR "
                + "('"+ dateFormat.format(getEndate()) +"' BETWEEN reservation.start_date AND reservation.end_date)) AND parking_slot.id=reservation.slot_id ) AND parking_slot.status='Available'";
        int res[] = new int[15];

        try{

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            int i = 0;

            while(rs.next()) {
                res[i] = rs.getInt("id");
                i++;
            }
            return res;
        }
        catch (SQLException e)
            {
              EventLog.Write("Reserve.checkDates Exception: "+e.getMessage());
              return null;
            }
      
      
    }
    
    public ResultSet getResbyCusId(int name_id) 
    {
        String sql = "SELECT reservation.id,veh_number,slot_id,duration,amount,status FROM reservation, vehicles WHERE reservation.veh_id = vehicles.id AND reservation.customer_id = ? ORDER BY reservation.id DESC";
        try{
                //using a prepared statement to preven SQL Injection and other simillar attacks
                PreparedStatement prest = con.prepareStatement(sql);
                prest.setInt (1, name_id);

                ResultSet rs = prest.executeQuery();
                return rs;
            }
          catch(SQLException e)
        {
            EventLog.Write("searchStaff Exception : "+e.getMessage());
            return null;
        } 
    }
    
    public static double getAmountbyId(int id) 
    {
        String sql = "SELECT amount FROM reservation WHERE id=?";
        try{
                //using a prepared statement to preven SQL Injection and other simillar attacks
                PreparedStatement prest = con.prepareStatement(sql);
                prest.setInt (1, id);

                ResultSet rs = prest.executeQuery();
                while(rs.next())
                {
                    return rs.getDouble("amount");
                }
                    
                return 0;
            }
          catch(SQLException e)
        {
            EventLog.Write("getAmountbyId Exception : "+e.getMessage());
            return 0;
        } 
    }
    
    public static String getStatusbyId(int id) 
    {
        String sql = "SELECT status FROM reservation WHERE id=?";
        try{
                //using a prepared statement to preven SQL Injection and other simillar attacks
                PreparedStatement prest = con.prepareStatement(sql);
                prest.setInt (1, id);

                ResultSet rs = prest.executeQuery();
                while(rs.next())
                {
                    return rs.getString("status");
                }
                    
                return "";
            }
          catch(SQLException e)
        {
            EventLog.Write("getAmountbyId Exception : "+e.getMessage());
            return "";
        } 
    }
    
    public int getLastid() 
    {
        int id = 0;
        
        String sql = "SELECT id FROM reservation WHERE id = (SELECT MAX(id) FROM reservation)";
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
        }
        return id;
    }
    
    public ResultSet searchReservation(String id,String cus_id, String veh_num) 
    {
        String sql = "SELECT reservation.id, customer_id, slot_id, veh_number, fee, duration, amount, start_date, end_date, status "
                + "FROM reservation,vehicles,fee "
                + "WHERE reservation.fee_id=fee.id AND reservation.veh_id=vehicles.id AND ( reservation.id LIKE ? AND reservation.customer_id LIKE ? AND veh_number LIKE ?) ORDER BY reservation.id DESC";
        try{
                //using a prepared statement to preven SQL Injection and other simillar attacks
                PreparedStatement prest = con.prepareStatement(sql);
                prest.setString (1, "%"+id+"%");
                prest.setString (2, "%"+cus_id+"%");
                prest.setString (3, "%"+veh_num+"%");



                ResultSet rs = prest.executeQuery();
                return rs;
            }
          catch(SQLException e)
        {
            EventLog.Write("searchReservation Exception : "+e.getMessage());
            return null;
        } 
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the slot_id
     */
    public int getSlot_id() {
        return slot_id;
    }

    /**
     * @param slot_id the slot_id to set
     */
    public void setSlot_id(int slot_id) {
        this.slot_id = slot_id;
    }

    /**
     * @return the veh_id
     */
    public int getVeh_id() {
        return veh_id;
    }

    /**
     * @param veh_id the veh_id to set
     */
    public void setVeh_id(int veh_id) {
        this.veh_id = veh_id;
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
     * @return the duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * @return the stdate
     */
    public Date getStdate() {
        return stdate;
    }

    /**
     * @param stdate the stdate to set
     */
    public void setStdate(Date stdate) {
        this.stdate = stdate;
    }

    /**
     * @return the endate
     */
    public Date getEndate() {
        return endate;
    }

    /**
     * @param endate the endate to set
     */
    public void setEndate(Date endate) {
        this.endate = endate;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
