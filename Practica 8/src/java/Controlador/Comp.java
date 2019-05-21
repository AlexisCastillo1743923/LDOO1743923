
package Controlador;

import conexion.ConexionBase;
import Modelo.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Comp", urlPatterns = {"/Comp"})
public class Comp extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        String user = request.getParameter("username");
        String pass = request.getParameter("contrasena");
        Usuario usuario = new Usuario(user,pass);
        Conexion conexion = new Conexion();
    
        boolean vu = conexion.verificarUsuario(usuario);

        if(vu){
                response.sendRedirect("InicioSesion.jsp");
        }else{
                response.sendRedirect("Error.jsp"); 
        }
        
    }
}