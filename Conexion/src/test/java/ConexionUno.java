
import java.sql.*;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vegav
 */
public class ConexionUno {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL ";
        try{
            //Crear conexion con base de datos
            Connection conexion = DriverManager.getConnection(url,"root","");
            //Crear una declartacion del como se va a trabajar con la base de datos
            Statement declaracion = conexion.createStatement();
            String SQL = "SELECT * FROM usuario_casas";
            //Variable que recibira el reaultado de ejecutar la secuencia sql 
            ResultSet resultado = declaracion.executeQuery(SQL);
            //Imprimir valores
            while (resultado.next()){
                System.out.println(resultado.getInt("id"));
                System.out.println(resultado.getInt("id_usuarios"));
                System.out.println(resultado.getString("casa_vieja"));
                System.out.println(resultado.getString("casa_nueva"));
                System.out.println(resultado.getString("fecha_cambio"));
            }
            // Cerrrar toda conexion con la base de datos
            resultado.close();
            declaracion.close();
            conexion.close();
            
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
       
    }
}
