
import Conexion.Conexion;
import DaoUsuarios.DaoUsuarios;
import Usuarios.Usuarios;
import java.sql.*;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vegav
 */
public class Eliminar {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el id del usuario a eliminar: ");
        int id = scanner.nextInt();
        Usuarios usuario = new Usuarios(id);
        DaoUsuarios.eliminar(usuario);
        /*
        String url="jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL ";
        try{
            //Crear conexion con base de datos
            //Connection conexion = DriverManager.getConnection(url,"root","");
            //Crear una declartacion del como se va a trabajar con la base de datos
            Connection conexion = Conexion.getConnection();
            String SQL = "DELETE FROM usuarios WHERE id=?";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa el id del usuario a eliminar: ");
            int id = scanner.nextInt();
        
            declaracion.setInt(1, id);
            
            declaracion.executeUpdate();
            
            //Variable que recibira el resultado de ejecutar la secuencia sql 
           
            // Cerrrar toda conexion con la base de datos
            Conexion.close(declaracion, conexion);
            //declaracion.close();
            //conexion.close();   
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
        */
    }
}
