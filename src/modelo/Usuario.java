package modelo;

public class Usuario {
    private String rut;
    private String nombre;
    private String rol;
    private boolean activo; // true = Activo, false = Inactivo

    public Usuario() {
    }

    public Usuario(String rut, String nombre, String rol, boolean activo) {
        this.rut = rut;
        this.nombre = nombre;
        this.rol = rol;
        this.activo = activo;
    }

    public String getRut() { return rut; }
    public void setRut(String rut) { this.rut = rut; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }

    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }
}