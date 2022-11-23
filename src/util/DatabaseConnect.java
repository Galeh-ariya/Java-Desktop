package util;

import java.sql.*;

/**
 *
 * @author GALEH
 */
public class DatabaseConnect {
    
    private static Connection connect;
    private static String jdbcurl = "jdbc:mysql://localhost:3306/library";
    private static String password = "kepo";
    
    
    public static Connection getConnection() throws ClassNotFoundException {
        
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                connect = DriverManager.getConnection(jdbcurl, "galeh", password);
            } catch(Exception e) {
                System.out.println("Error " + e.getMessage());
            }
            
        return connect;
    }
    
}
