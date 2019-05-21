package Modelo;

public final class UsuarioMaster extends Usuario{
    
    private String numEmpleado;
    
    public UsuarioMaster(String username, String contrasena, String nombre, String apellido, String email, String fecha, String numEmpleado){
        setUsername(username);
        setContrasena(contrasena);
        setNombre(nombre);
        setApellido(apellido);
        setEmail(email);
        setFecha(fecha);
        setNumEmpleado(numEmpleado);
        setTipoUsuario();
    }

    public String getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(String numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
    
    @Override
    public void setTipoUsuario(){
        this.tipoUsuario = "Administrador";
    }
    
    @Override
    public String mostrarInformación(){
        String str = "Nombre Completo: " + getNombre() + " " + getApellido() + "<br>";
        str += "Usuario: " + getUsername() + "<br>";
        str += "Contraseña: " + getContrasena() + "<br>";
        str += "Email: " + getEmail() + "<br>";
        str += "Cumpleaños: " + getFecha() + "<br>";
        str += "Numero de Empleado: " + getNumEmpleado() + "<br>";
        str += "Tipo de usuario: " + getTipoUsuario() + "<br>";
        return str;
    }
}