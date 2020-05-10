
package clases;
import java.sql.*;

public class Conexion {
    //conexion Con la base de datos local
    public static Connection conectar(){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ds", "root", "");
            return cn;
            
        } catch (SQLException e) {
            System.out.println("se ha producido un error en la conexion local" + e);
        }
        return (null);
    }
}
