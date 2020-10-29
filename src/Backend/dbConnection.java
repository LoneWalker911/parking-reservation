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
class dbConnection {
    private final String conn_string = "jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12373402";
    private final String username = "sql12373402";
    private final String password = "AqtVSkkwVN";
    
public Connection CreateConn(){  
try{  
    Connection con;
    con = DriverManager.getConnection(conn_string,username,password);
    return con;
    }
catch(SQLException e){System.out.println(e); return null;}  
                                }  
                    }
