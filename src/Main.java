import acceso_datos.Conexion;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando prueba de conexión...");
        Connection cn = Conexion.conectar();
        
        if (cn != null) {
            System.out.println("¡Éxito! La aplicación Java se ha conectado a MySQL mediante JDBC.");
            try {
                cn.close(); // Cerramos la conexión de prueba
            } catch (Exception e) {
                System.out.println("Error al cerrar: " + e.getMessage());
            }
        } else {
            System.out.println("Fallo en la conexión. Verifica que XAMPP tenga MySQL encendido.");
        }
    }
}