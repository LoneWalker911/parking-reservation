/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author thisa
 */
public class dbConnection {
    
    private final static String conn_string = "jdbc:mysql://nsbmpark.mysql.database.azure.com:3306/nsbmpark?useSSL=true&requireSSL=false&autoReconnect=true";
    private final static String username = "parkadmin@nsbmpark";
    private final static String password = "Nsbmpark@2020";
    
public static Connection CreateConn()
{  
    try
    {  
        Connection con = DriverManager.getConnection(conn_string,username,password);
        return con;
    }
    catch(SQLException e)
    {
        System.out.println(e); return null;
    }  
}

}
