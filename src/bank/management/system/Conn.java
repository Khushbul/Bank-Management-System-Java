
package bank.management.system;

import java.sql.*;

/*  1. Register the Driver
    2. Create connection
    3. Create Statement
    4. Executive Query
    5. Close Connection
*/

public class Conn {
    
    Connection c;
    Statement s;
    public Conn(){
        try {
            // 1. Registering the driver
            // Class.forName(com.mysql.cj.jdbc.driver); // no ned after importing the mysql library from files.
            
            // 2. Creating Connection
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "0000");
            
            // 3. Creating Statement
            s= c.createStatement();
            
            
        } catch (Exception e) {
            System.err.println(e);
        }    
    }
    
}
