package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ExCookie", urlPatterns = {"/ExCookie"})
public class ExCookie extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String bookValue = request.getParameter("Remove");
        if (bookValue != null) {
            Cookie[] cookies = request.getCookies();
            for(int i=0; i < cookies.length; i++) {
                if(cookies[i] != null){
                    cookies[i].setMaxAge(0);
                }
                
            }
        }
        response.sendRedirect("login.jsp");
    }
}