package acceso_datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Usuario;

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
    // Método para crear un nuevo usuario (Parte del CRUD - HJM-01)
    public boolean registrarUsuario(Usuario usuario) {
        String sql = "INSERT INTO Usuarios (rut, nombre, email, password, rol_id, estado) VALUES (?, ?, ?, ?, ?, ?)";
        
        try (Connection con = Conexion.conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, usuario.getRut());
            ps.setString(2, usuario.getNombre());
            ps.setString(3, usuario.getEmail());
            ps.setString(4, usuario.getPassword());
            ps.setInt(5, usuario.getRolId());
            ps.setString(6, usuario.getEstado());
            
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;
            
        } catch (SQLException e) {
            System.out.println("Error al registrar el nuevo usuario: " + e.getMessage());
            return false;
        }
    }
}
