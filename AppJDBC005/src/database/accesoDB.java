
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class accesoDB {
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
        Connection cn;
        
        Class.forName("oracle.jdbc.OracleDriver");
        String url="jdbc:oracle:thin:@localhost:1521:XE";
        return cn=DriverManager.getConnection(url,"neptuno","admin");
    }
}
