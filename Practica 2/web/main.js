/**
 * Marcos Alexis Castillo Puente
 * Matricula: 1743923
 */
function validacion(){
    var nombre, apellido, fecha, email, contraseña;
    nombre= document.getElementById("nombres").value;
    apellido = document.getElementById("apellidos").value;
    fecha = document.getElementById("fecha").value;
    email = document.getElementById("email").value;
    contraseña = document.getElementById("contraseña").value;
    


    if(nombre === "" || apellido === "" || fecha === "" || email === "" || contraseña === ""){
        alert("Favor de rellenar todos los campos");
        return false;
    }else if(nombre.length>50 | apellido.length>50 | fecha.length>50 | email.length>50 | contraseña.length>50){
        alert("Valores no permitidos");
        return false;
    }else if(nombre === null || apellido === null || fecha === null || email === null || contraseña === null){
        alert("Valores no permitidos");
        return false;
    }
    
}

