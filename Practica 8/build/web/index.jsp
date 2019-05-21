<%-- 
 * Marcos Alexis Castillo Puente
 * Matricula: 1743923
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
   	<title>Inicio</title>
	<link rel = "stylesheet" type="text/css" href = "main.css">
   	<script src = "main.js"></script>
    </head>
    <body>
        <!-- Logo -->
						<h1><a href="index.html" id="logo">NOTICIAS <br> & Más <em>Sin Fronteras</em></a></h1>
                                                
					<!-- Nav -->
						<nav id="nav">
                                                        <ul>
								<li class="current"><a href="index.jsp">INICIO</a></li>
								<li><a href="noticias.html">NOTICIAS</a></li>
                                                                <li><a href="entretenimiento.html">ENTRETENIMIENTO</a></li>
                                                                <li><a href="ecologia.html">ECOLOGÍA</a></li>
								<li><a href="tecnologia.html">TECNOLOGÍA</a></li>
								<li><a href="Registro.jsp">REGISTRARSE</a></li>
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
												<h2>Iniciar Sesión</h2>
											
											</header>

                                                                                            <form class="login" onsubmit="return error();" action="Comp" method="POST">
                                                                                                <label>Usuario:</label>
                                                                                                <input id="username" type="text" name="username"><br>
                                                                                                <label>Contraseña:</label>
                                                                                                <input id="contrasena" type="password" name="contrasena"><br>

                                                                                                <input id="submit" type="submit" value="Entrar">
                                                                                                <br>¿No estás Registrado? <a id="registrarse" href="Registro.jsp">Registrarse</a>
                                                                                            </form>

                                                                                </article>

								</div>
    </body>
</html>