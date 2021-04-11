
import Conexion.Conexion;
import DaoUsuarios.DaoUsuarios;
import Usuarios.Usuarios;
import java.sql.*;
import java.util.Scanner;


/**
 *
 * @author vegav
 */
public class Update {
    public static void main(String args[]) throws SQLException{
        String url = "jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
     
            Scanner scan = new Scanner(System.in);
            System.out.println("Ingrese el id del usuario a actulizar:");
            int id = scan.nextInt();
            scan.nextLine();
            System.out.println("Actualice el nombre del Usuario:");
            String nombre = scan.nextLine();
            System.out.println("Actualice la contraseña:");
            String contraseña = scan.nextLine();
            System.out.println("Actualice el estado:");
            int status = scan.nextInt();
            Usuarios usuario = new Usuarios(id, nombre, contraseña, status);
            DaoUsuarios.update(usuario);
       /*   declaracion.setString(1, nombre);
            declaracion.setString(2, contraseña);
            declaracion.setInt(3,status);
            declaracion.setInt(4, id);
            declaracion.executeUpdate();
            
            //cerrar toda conexion con la BD
            Conexion.close(conexion, declaracion);
            //declaracion.close();
            //conexion.close();
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }*/
    }
}