
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
public class Actualizar {
    public static void main(String[] args) throws SQLException {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el id del usuario que quieres actualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine();
            
        System.out.println("Actualiza nombre del usuario: ");
        String nombre = scanner.nextLine();
            
        System.out.println("Actualiza contraseña del usuario: ");
        String contraseña = scanner.nextLine();
        scanner.nextLine();
          
        System.out.println("Actualiza el status del usuario: ");
        int status = scanner.nextInt();
        
        Usuarios usuario = new Usuarios(id, nombre, contraseña, true);
        DaoUsuarios.actualizar(usuario);
        
        /*
        String url="jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL ";
        try{
           
            //Connection conexion = DriverManager.getConnection(url,"root","");
            //Crear una declartacion del como se va a trabajar con la base de datos
            Connection conexion = Conexion.getConnection();
            
            String SQL = "UPDATE usuarios SET nombre_usuario=?, contraseña=?, status = ? WHERE id=? ";
            PreparedStatement declaracion = conexion.prepareStatement(SQL);
            
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa el id del usuario que quieres actualizar: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("Actualiza nombre del usuario: ");
            String nombre = scanner.nextLine();
            scanner.nextLine();
            
            System.out.println("Actualiza contraseña del usuario: ");
            String contraseña = scanner.nextLine();
            scanner.nextLine();
            
            System.out.println("Actualiza el status del usuario: ");
            int status = scanner.nextInt();
        
            declaracion.setString(1, nombre);
            declaracion.setString(2, contraseña);
            declaracion.setInt(3, status);
            declaracion.setInt(4, id);
            
            declaracion.executeUpdate();
            Conexion.close(declaracion, conexion);
            //declaracion.close();
            //conexion.close();
            
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
        */
    }
     
   }
