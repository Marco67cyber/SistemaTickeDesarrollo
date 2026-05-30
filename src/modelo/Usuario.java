package modelo;

public class Usuario {
    private String rut;
    private String nombre;
    private String email;
    private String password;
    private int rolId; // 1: Jefe, 2: Ejecutivo
    private String estado; // 'activo' o 'inactivo'

    public Usuario() {
    }

    public Usuario(String rut, String nombre, String email, String password, int rolId, String estado) {
        this.rut = rut;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.rolId = rolId;
        this.estado = estado;
    }

    // Getters y Setters
    public String getRut() { return rut; }
    public void setRut(String rut) { this.rut = rut; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public int getRolId() { return rolId; }
    public void setRolId(int rolId) { this.rolId = rolId; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}