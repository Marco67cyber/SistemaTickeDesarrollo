import acceso_datos.UsuarioDAO;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Prueba Unitaria: HJM-02 Desactivación Lógica ---");
        
        UsuarioDAO dao = new UsuarioDAO();
        
        // Inserte aquí un RUT que exista en su base de datos local
        String rutPrueba = "26463490-3";
        
        boolean resultado = dao.desactivarUsuarioLogicamente(rutPrueba);
        
        if (resultado) {
            System.out.println("Transacción exitosa. El usuario ha sido desactivado del sistema.");
        } else {
            System.out.println("Fallo en la transacción. Verifique que el RUT exista y la conexión esté activa.");
        }
    }
}