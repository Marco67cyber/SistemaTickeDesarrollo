import acceso_datos.UsuarioDAO;
import modelo.Usuario;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Prueba Unitaria: HJM-01 Registro de Usuario ---");
        
        // 1. Creamos un usuario de prueba (Ej: un nuevo Ejecutivo)
        Usuario nuevoEmpleado = new Usuario(
            "19876543-2", 
            "Ana Lopez", 
            "alopez@consultenos.cl", 
            "hash_seguro_789", 
            2, 
            "activo"
        );
        
        // 2. Usamos el DAO para enviarlo a MySQL
        UsuarioDAO dao = new UsuarioDAO();
        boolean exito = dao.registrarUsuario(nuevoEmpleado);
        
        if (exito) {
            System.out.println("¡Éxito! Ana Lopez fue registrada en la base de datos.");
        } else {
            System.out.println("Fallo al registrar. Revisa que el RUT no esté duplicado.");
        }
    }
}