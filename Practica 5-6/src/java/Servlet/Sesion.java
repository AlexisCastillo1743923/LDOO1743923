
package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Sesion", urlPatterns = {"/Sesion"})
public class Sesion extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String user = request.getParameter("username");
        String pass = request.getParameter("contrasena");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String email = request.getParameter("email");
        String fecha = request.getParameter("fecha");
        HttpSession session = request.getSession();
        session.setAttribute("username", user);
        session.setAttribute("password", pass);
        session.setAttribute("nombre", nombre);
        session.setAttribute("apellido", apellido);
        session.setAttribute("email", email);
        session.setAttribute("fecha", fecha);
        response.sendRedirect("index.jsp");
        
        
    }
}
