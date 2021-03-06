<%-- 
 * Marcos Alexis Castillo Puente
 * Matricula: 1743923
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
   	<title>Registro</title>
	<link rel = "stylesheet" type="text/css" href = "main.css">
   	<script src = "main.js"></script>
    </head>
    <body>
        <!-- Logo -->
						<h1><a href="index.html" id="logo">NOTICIAS <br> & Más <em>Sin Fronteras</em></a></h1>
                                                
					<!-- Nav -->
						<nav id="nav">
                                                        <ul>
								<li><a href="index.jsp">INICIO</a></li>
								<li><a href="noticias.html">NOTICIAS</a></li>
                                                                <li><a href="entretenimiento.html">ENTRETENIMIENTO</a></li>
                                                                <li><a href="ecologia.html">ECOLOGÍA</a></li>
								<li><a href="tecnologia.html">TECNOLOGÍA</a></li>
								<li class="current"><a href="Registro.jsp">REGISTRARSE</a></li>
                                                                <li><a href="login.jsp">ACCEDER</a></li>
							</ul>
						
						</nav>
			<!-- Main -->
				<section class="wrapper style1">
					<div class="container">
						<div class="row 200%">
							<div class="4u 12u(narrower)">
								<div id="sidebar">

									<!-- Sidebar -->

										<section>
											<h3>AVISO DE PRIVACIDAD</h3>
											<p> 
                                                                                            Otorgamos la máxima importancia a la confidencialidad y debida protección de la 
                                                                                            información personal que le es confiada. Por su Código de Ética estámos comprometidos a manejar 
                                                                                            tus datos personales de manera responsable y con apego a lo previsto en los Lineamientos de Transparencia, 
                                                                                            Acceso a la Información, Archivos y Protección de Datos Personales y demás normatividad aplicable.</p>
											
										</section>

										
										

								</div>
							</div>
							<div class="8u  12u(narrower) important(narrower)">
								<div id="content">

									<!-- Content -->

										<article>
											<header>
												<h2>Registro</h2>
												<p>Registrate aqui para ver y comentar.</p>
											</header>

                                                                                        <form onsubmit="return validar();" class="login"  action="Registrar" method="POST">
                                                                                        
                                                                                        Tipo De Usuario:
                                                                                        <select id="tipousuario" name="tipousuario" >   
                                                                                            <option value=""></option>
                                                                                            <option value="Administrador">Administrador</option>
                                                                                            <option value="Normal">Normal</option>
                                                                                            <option value="Invitado">Invitado</option>
                                                                                        </select><br>
                                                                                        
                                                                                        Nombre(s):
                                                                                        <input id="nombres" type="text" name="nombre"><br>

                                                                                        Apellidos:
                                                                                        <input id="apellidos" type="text" name="apellido"><br>
            
                                                                                        Fecha De Nacimiento:
                                                                                        <input id="fecha" type="date" name="fecha"><br>
                                                                                        
                                                                                        Número De Empleado:
                                                                                        <input onclick="alert('Si seleccionaste la opcion Administrador, favor de ingresar un ID de empleado')"  id="numempleado" type="text" name="numEmpleado"><br>
                                                                                        
                                                                                        Nombre De Usuario:
                                                                                        <input id="username" type="text" name="username"><br>
                                                                                     	
                                                                                        E-mail:
                                                                                        <input id="email" type="email" name="email"><br>

                                                                                        Contraseña:
                                                                                        <input id="contraseña" type="password" name="contraseña"><br>
                                                                                        
                                                                                        Fecha De Registro:
                                                                                        <input onclick="alert('Por favor, ingresa el dia de hoy si eres invitado')" id="fechaRegistro" type="date" name="fechaRegistro"><br>
			
                                                                                        <input id="enviar" type="submit" value="Registrar">
                                                                                        </form>
    </body>
</html>