import presentacion.FrmLogin;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Main {
    public static void main(String[] args) {
        
        // Ponerle un estilo más moderno a las ventanas (Look and Feel)
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Error cargando el tema visual.");
        }

        // Arrancar la interfaz gráfica de forma segura
        SwingUtilities.invokeLater(() -> {
            FrmLogin ventanaLogin = new FrmLogin();
            ventanaLogin.setVisible(true);
        });
    }
}