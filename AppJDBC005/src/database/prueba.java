
package database;

import java.sql.Connection;
import java.sql.SQLException;


public class prueba {
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        Connection cn=accesoDB.getConnection();
        System.out.println("Conexion Conforme-->");
    }
}
