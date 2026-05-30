package modelo;

public class Cliente {
    private String rut;
    private String nombre;
    private String telefono;
    private String email;

    // Constructor vacío
    public Cliente() {
    }

    // Constructor con parámetros
    public Cliente(String rut, String nombre, String telefono, String email) {
        this.rut = rut;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    // Getters y Setters
    public String getRut() { return rut; }
    public void setRut(String rut) { this.rut = rut; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}