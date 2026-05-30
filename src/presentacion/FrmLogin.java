package presentacion;

import javax.swing.*;
import java.awt.*;

public class FrmLogin extends JFrame {

    // Componentes de la interfaz
    private JTextField txtRut;
    private JPasswordField txtClave;
    private JButton btnIngresar;

    public FrmLogin() {
        // Configuración principal de la ventana
        setTitle("Consultora Consúltenos - Acceso al Sistema");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setResizable(false);
        setLayout(new BorderLayout());

        // Panel superior (Título)
        JPanel panelNorte = new JPanel();
        panelNorte.setBackground(new Color(41, 128, 185)); // Azul corporativo
        JLabel lblTitulo = new JLabel("MESA DE AYUDA");
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        panelNorte.add(lblTitulo);

        // Panel central (Formulario)
        JPanel panelCentro = new JPanel(new GridLayout(2, 2, 10, 20));
        panelCentro.setBorder(BorderFactory.createEmptyBorder(30, 40, 30, 40));
        
        panelCentro.add(new JLabel("RUT Usuario:"));
        txtRut = new JTextField();
        panelCentro.add(txtRut);
        
        panelCentro.add(new JLabel("Contraseña:"));
        txtClave = new JPasswordField();
        panelCentro.add(txtClave);

        // Panel inferior (Botón)
        JPanel panelSur = new JPanel();
        panelSur.setBorder(BorderFactory.createEmptyBorder(10, 10, 20, 10));
        btnIngresar = new JButton("Ingresar al Sistema");
        btnIngresar.setFont(new Font("Arial", Font.BOLD, 14));
        btnIngresar.setBackground(new Color(46, 204, 113)); // Verde éxito
        btnIngresar.setForeground(Color.WHITE);
        panelSur.add(btnIngresar);

        // Ensamblar todo en la ventana
        add(panelNorte, BorderLayout.NORTH);
        add(panelCentro, BorderLayout.CENTER);
        add(panelSur, BorderLayout.SOUTH);
    }
}