/**
 * Marcos Alexis Castillo Puente
 * Matricula: 1743923
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String name = request.getParameter("nombre");
            String last = request.getParameter("apellido");
            String date = request.getParameter("fecha");
            String mail = request.getParameter("email");
            String pass = request.getParameter("contraseña");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletBasico</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Usuario Registrado</h2><br>");
            out.println("<h3>Nombre: " + name + " " + last + "</h3><br>");
            out.println("<h3>Fecha de nacimiento: " + date + "</h3><br>");
            out.println("<h3>Email: " + mail + "</h3><br>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
