/* 
 * Marcos Alexis Castillo Puente
 * Matricula: 1743923
 */
function validacion(){
    var nombre, apellido, email, contraseña, fecha, usuario;
    nombre= document.getElementById("nombres").value;
    apellido = document.getElementById("apellidos").value;
    email = document.getElementById("email").value;
    contraseña = document.getElementById("contrasena").value;
    fecha = document.getElementById("fecha").value;
    usuario = document.getElementById("username").value;


    if(nombre === "" || apellido === "" || email === "" || contraseña === "" || fecha === "" || usuario === ""){
        alert("Rellene todos los campos");
        return false;
    }else if(nombre.length>50 | apellido.length>50 | email.length>50 | contraseña.length>50 | fecha.length>50 | usuario.length>50){
        alert("Valores no permitidos");
        return false;
    }else{
        return true;
    }
    
}

function error(){
    var contraseña, usuario;
    contraseña= document.getElementById("contrasena").value;
    usuario = document.getElementById("username").value;
    if( contraseña === "" || usuario === ""){
        alert("Rellene todos los campos");
        return false;
    }else if(contraseña.length>50 | usuario.length>50){
        alert("Valores no permitidos");
        return false;
    }else{
        return true;
    }
}