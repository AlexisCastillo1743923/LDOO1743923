package Modelo;

public final class UsuarioInvitado extends Usuario{
    
    private String fechaRegistro;
    
    public UsuarioInvitado(String username, String contrasena, String nombre, String apellido, String email, String fecha, String fechaRegistro){
        setUsername(username);
        setContrasena(contrasena);
        setNombre(nombre);
        setApellido(apellido);
        setEmail(email);
        setFecha(fecha);
        setFechaRegistro(fechaRegistro);
        setTipoUsuario();
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    @Override
    public void setTipoUsuario(){
        this.tipoUsuario = "Invitado";
    }
    
    @Override
    public String mostrarInformación(){
        String str = "Nombre Completo: " + getNombre() + " " + getApellido() + "<br>";
        str += "Usuario: " + getUsername() + "<br>";
        str += "Contraseña: " + getContrasena() + "<br>";
        str += "Email: " + getEmail() + "<br>";
        str += "Cumpleaños: " + getFecha() + "<br>";
        str += "Fecha De Registro: " + getFechaRegistro() + "<br>";
        str += "Tipo de usuario: " + getTipoUsuario() + "<br>";
        return str;
    }
}