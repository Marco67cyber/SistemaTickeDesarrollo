package acceso_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    // Parámetros de conexión para el entorno local de XAMPP
    private static final String URL = "jdbc:mysql://localhost:3306/db_consultenos"; 
    private static final String USER = "root";
    private static final String PASSWORD = ""; // En XAMPP viene vacío por defecto
    
    public static Connection conectar() {
        Connection con = null;
        try {
            // Registrar el driver de MySQL (opcional en versiones modernas de Java, pero seguro)
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establecer la conexión
            con = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se encontró el Driver de MySQL. " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de conexión a la base de datos: " + e.getMessage());
        }
        return con;
    }
}