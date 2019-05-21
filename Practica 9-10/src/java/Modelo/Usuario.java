package Modelo;

public abstract class Usuario {
    protected String nombre;
    protected String apellido;
    protected String username;
    protected String email;
    protected String contrasena;
    protected String fecha;
    protected String tipoUsuario;
    
    public Usuario(){
    }
    
    public Usuario(String username, String contrasena, String nombre, String apellido, String email, String fecha){
        setUsername(username);
        setContrasena(contrasena);
        setNombre(nombre);
        setApellido(apellido);
        setEmail(email);
        setFecha(fecha);
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public abstract void setTipoUsuario();  
    public abstract String mostrarInformación();
}