<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%

    Cookie[] cookies = request.getCookies();
            for(int i=0; i < cookies.length; i++) {
                if(cookies[i] != null){
                    cookies[i].setMaxAge(0);
                    response.addCookie(cookies[i]);
                }
                
    }
        response.sendRedirect("index.jsp");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <h1></h1>
    </body>
</html>
