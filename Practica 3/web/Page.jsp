<%-- 
* Marcos Alexis Castillo Puente
* Matricula: 1743923
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro terminado</title>
        <link rel = "stylesheet" type="text/css" href = "main.css">
   	<script src = "main.js"></script>
    </head>
    <body onload="return bienvenido();">
            <h2>Usuario Registrado</h2><br>
        <div class="server">
            <h3>Nombre: <%=request.getParameter("nombre")%> <%=request.getParameter("apellido")%></h3><br>
            <h3>Fecha de nacimiento: <%=request.getParameter("fecha")%> </h3><br>
            <h3>Email: <%=request.getParameter("email")%> </h3><br>
        </div>
    </body >
</html>
