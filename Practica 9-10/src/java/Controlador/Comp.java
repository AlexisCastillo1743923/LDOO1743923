/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Factory.Singleton;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Comp extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        
        Singleton factory = Singleton.getSingleton();
        
        String user = request.getParameter("username");
        String pass = request.getParameter("contrasena");

            if (factory.getUsuario(user)!=null){
                if (factory.getUsuario(user).getUsername().equals(user) && factory.getUsuario(user).getContrasena().equals(pass)){
                    request.getSession().setAttribute("Usuario", user);
                    response.sendRedirect("InicioSesion.jsp");
                }else {
                    response.sendRedirect("Error.jsp");
                }
            }else 
                response.sendRedirect("RegistroUsuario.jsp");
    }
}