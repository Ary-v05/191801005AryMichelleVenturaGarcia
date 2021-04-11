
import java.sql.*;
import DaoUsuarios.DaoUsuarios;
import Usuarios.Usuarios;
import java.util.ArrayList;
import java.util.List;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vegav
 */
public class Lista {
    public static void main(String[] args) throws SQLException {
        List<Usuarios> listUsuarios = new ArrayList<>();
        listUsuarios = DaoUsuarios.listaUsuarios();
        
        for(Usuarios usuario:listUsuarios){
            System.out.println(usuario);
        }
        /*
        //Crear conexion con base de datos
        //Connection conexion = DriverManager.getConnection(url,"root","");
        Connection conexion = Conexion.getConnection();
        //Crear una declartacion del como se va a trabajara con la base de datos
        Statement declaracion = conexion.createStatement();
        String SQL = "SELECT * FROM usuarios";
           
        //Variable que recibira el resultado de ejecutar la secuencia sql 
        ResultSet resultado = declaracion.executeQuery(SQL);
          
        //Imprimir valores
        while (resultado.next()){
                System.out.println(resultado.getInt("id"));
                System.out.println(resultado.getString("nombre_usuario"));
                System.out.println(resultado.getString("contraseña"));
                System.out.println(resultado.getString("status"));
        }
        // Cerrrar toda conexion con la base de datos
        Conexion.close(conexion, declaracion, resultado);
        */
    }
}
