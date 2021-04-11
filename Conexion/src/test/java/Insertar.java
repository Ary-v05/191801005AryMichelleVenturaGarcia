
import java.sql.*;
import java.util.Scanner;
import DaoUsuarios.DaoUsuarios;
import Usuarios.Usuarios;


/**
 *
 * @author vegav
 */
public class Insertar {
    public static void main(String args[]) throws SQLException{
        
        //String url = "jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        /*try{
            //crear conexion con BD
            //Connection conexion = DriverManager.getConnection(url,"root","");
            Connection conexion = Conexion.getConnection();
            //crear una declaracion de como se va a trabajar con la BD
            String SQL = "INSERT INTO usuarios(nombre_usuario,contraseña,status) VALUES (?,?,?)";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            */
            System.out.println("Ingrese el nombre del Usuario:");
            Scanner scan = new Scanner(System.in);
            String nombre = scan.nextLine();
            System.out.println("Ingrese la contraseña:");
            String contraseña = scan.nextLine();
            Usuarios usuario = new Usuarios(nombre,contraseña);
            
            DaoUsuarios.insertar(usuario);
 
    }
}