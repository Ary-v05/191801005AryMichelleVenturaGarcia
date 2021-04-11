
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
public class Insertar {
    public static void main(String[] args) throws SQLException {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nombre del usuario: ");
        String nombreUsuario = scanner.nextLine();
        System.out.println("Ingresa la contraseña del usuario: ");
        String contraseña = scanner.nextLine();
        Usuarios usuario = new Usuarios(nombreUsuario, contraseña);
        DaoUsuarios.insertar(usuario);
        System.out.println(usuario);
        /*
        String url="jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL ";
        try{
            //Crear conexion con base de datos
            //Connection conexion = DriverManager.getConnection(url,"root","");
            //Crear una declartacion del como se va a trabajar con la base de datos
            Connection conexion = Conexion.getConnection();
       
            String SQL = "INSERT INTO usuarios (nombre_usuario,contraseña,status) VALUES(?,?,?)";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa el nombre del usuario: ");
            String nombreUsuario = scanner.nextLine();
            System.out.println("Ingresa la contraseña usuario: ");
            String contraseña = scanner.nextLine();
            
            declaracion.setString(1,nombreUsuario );
            declaracion.setString(2,contraseña);
            declaracion.setInt(3, 1);
            
            declaracion.executeLargeUpdate();
            //Variable que recibira el resultado de ejecutar la secuencia sql 
           
            //Imprimir valores
           
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
