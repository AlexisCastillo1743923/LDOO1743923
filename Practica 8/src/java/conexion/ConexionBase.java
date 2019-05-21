package conexion;

import Modelo.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Alexis Castillo
 */
public class ConexionBase {

    public void agregarUsuario(User usuario) {
        try {
            
            String url = "jdbc:derby://localhost:1527/Practica";
            String username = "root";
            String password = "12345";
            Connection conexion = DriverManager.getConnection(url, username, password);
        
            Statement st = conexion.createStatement();
            st.executeUpdate("INSERT INTO LOGIN.USUARIO(USER, PASS) VALUES('" + usuario.getUsername() + ",'" + usuario.getContrasena() + ")");
            
            st.close();
            conexion.close();
        }
        catch (SQLException sqle) {
            System.out.println(sqle);
            
        }
    }
    
    public boolean verificarUsuario(User usuario){
        boolean existe = false;
        try {
            String url = "jdbc:derby://localhost:1527/Practica";
            String username = "root";
            String password = "12345";
            Connection conexion = DriverManager.getConnection(url, username, password);
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM LOGIN.USUARIO WHERE USER = '" + usuario.getUsername() + "' AND PASS ='" + usuario.getContrasena() + "'");
            
            if(rs.next()){
                existe = true;
            }else{
                existe = false ;
            }
            
            rs.close();
            st.close();
            conexion.close();
            
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        return existe;
    }
}