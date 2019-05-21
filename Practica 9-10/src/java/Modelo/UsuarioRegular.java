/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public final class UsuarioRegular extends Usuario{
    
    private String direccion;
    
    public UsuarioRegular(String username, String contrasena, String nombre, String apellido, String email, String fecha, String direccion){
        setUsername(username);
        setContrasena(contrasena);
        setNombre(nombre);
        setApellido(apellido);
        setEmail(email);
        setFecha(fecha);
        setDireccion(direccion);
        setTipoUsuario();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public void setTipoUsuario(){
        this.tipoUsuario = "Normal";
    }
    
    @Override
    public String mostrarInformación(){
        String str = "Nombre Completo: " + getNombre() + " " + getApellido() + "<br>";
        str += "Usuario: " + getUsername() + "<br>";
        str += "Contraseña: " + getContrasena() + "<br>";
        str += "Email: " + getEmail() + "<br>";
        str += "Cumpleaños: " + getFecha() + "<br>";
        str += "Dirección: " + getDireccion() + "<br>";
        str += "Tipo de usuario: " + getTipoUsuario() + "<br>";
        return str;
    }
}