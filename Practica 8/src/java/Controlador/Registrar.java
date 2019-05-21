/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import conexion.ConexionBase;
import Modelo.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Registrar", urlPatterns = {"/Registrar"})
public class Registrar extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String user = request.getParameter("username");
        String pass = request.getParameter("contrasena");
        Usuario usuario = new Usuario(user,pass);
        Conexion conexion = new Conexion();
        boolean vu = conexion.verificarUsuario(usuario);
        
        if(vu){
                response.sendRedirect("Registrado.jsp");
        }else{
                conexion.agregarUsuario(usuario);
                response.sendRedirect("index.jsp"); 
        }
        
    }    
}