
package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Comp", urlPatterns = {"/Comp"})
public class Comp extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        String user = request.getParameter("username");
        String pass = request.getParameter("contrasena");
        HttpSession session = request.getSession();
        Cookie[] cookies = request.getCookies();
        String username = (String) session.getAttribute("username");
        String password = (String) session.getAttribute("password");
        
        if(cookies != null ){
                    if(session.isNew()){
                        response.sendRedirect("Registro.jsp"); 
                    }else{
                        if(pass.equals(password) && user.equals(username)){
                            response.sendRedirect("InicioSesion.jsp");
                        }else{
                            response.sendRedirect("Error.jsp");
                        }    
                    }
        }else{
        Cookie usuario = new Cookie("Nombre_Usuario", user);
        Cookie contrasena= new Cookie("Contraseña", pass);

            usuario.setMaxAge(60*60*24);
            contrasena.setMaxAge(60*60*24); 
            
            response.addCookie(usuario);
            response.addCookie(contrasena);
            
            if(session.isNew()){
                response.sendRedirect("Registro.jsp");
            }else{
                response.sendRedirect("index.jsp");
                }
        }            

    }
}