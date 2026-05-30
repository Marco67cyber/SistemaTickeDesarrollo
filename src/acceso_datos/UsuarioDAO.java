package acceso_datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    // Método principal para cumplir la historia HJM-02
    public boolean desactivarUsuarioLogicamente(String rutUsuario) {
        // Asumiendo que su tabla tiene una columna llamada 'estado' (1=Activo, 0=Inactivo)
        // Ajuste el nombre de la tabla o columna según su script_creacion.sql exacto
        String sql = "UPDATE Usuarios SET estado = 'inactivo' WHERE rut = ?";
        
        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, rutUsuario);
            
            int filasAfectadas = ps.executeUpdate();
            
            // Si devuelve 1 o más, el update fue exitoso
            return filasAfectadas > 0;
            
        } catch (SQLException e) {
            System.out.println("Error crítico al intentar desactivar usuario: " + e.getMessage());
            return false;
        }
    }
}