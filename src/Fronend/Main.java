/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fronend;
import Backend.*;
import java.sql.SQLException;

/**
 *
 * @author thisa
 */
public class Main {
    public static void main(String[] args) {
        StaffLogin cn = new StaffLogin();
        cn.setVisible(true);
        
        Billing bl = new Billing();
        System.out.println(bl.CalculateBill(2));
        
        
        
    }
    
    
    
}
