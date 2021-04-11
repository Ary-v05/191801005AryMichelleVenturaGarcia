/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoUsuarios;

import Conexion.Conexion;
import Usuarios.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ntnrc
 */
public class DaoUsuarios {
   
    private static String SQL;
    public static List<Usuarios> listaUsuarios() throws SQLException{
       List<Usuarios> listUsuarios = new ArrayList<>();
       Connection conexion = Conexion.getConnection();
       Statement declaracion = conexion.createStatement();
       SQL = "SELECT * FROM usuarios";
       ResultSet resultado = declaracion.executeQuery(SQL);
       
       while (resultado.next()){
            Usuarios usuario = new Usuarios(resultado.getInt("id"),resultado.getString("nombre_usuario"),resultado.getString("contraseña"),resultado.getString("fecha_de_alta"),resultado.getBoolean("status"));
            listUsuarios.add(usuario);
            
        }
        Conexion.close(conexion, declaracion, resultado);
        return listUsuarios;
    }
    
    public static void insertar(Usuarios usuario) throws SQLException{
        Connection conexion = Conexion.getConnection();
        SQL = "INSERT INTO usuarios (nombre_usuario,contraseña,status) VALUES(?,?,?)";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        declaracion.setString(1,usuario.getNombreUsuario() );
        declaracion.setString(2, usuario.getContraseña());
        declaracion.setInt(3, 1);
        
        declaracion.executeLargeUpdate();
        Conexion.close(declaracion, conexion);
    }
    public static void eliminar(Usuarios usuario) throws SQLException{
        Connection conexion = Conexion.getConnection();
        SQL = "DELETE FROM usuarios WHERE id=?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setInt(1,usuario.getId());
        declaracion.executeUpdate();
        Conexion.close(declaracion, conexion);
    }
    public static void actualizar(Usuarios usuario) throws SQLException{
        Connection conexion = Conexion.getConnection();
        SQL = "UPDATE usuarios SET nombre_usuario=?, contraseña=?, status = ? WHERE id=? ";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setString(1,usuario.getNombreUsuario());
        declaracion.setString(2,usuario.getContraseña());
        //declaracion.setInt(3,usuario.);
        declaracion.setInt(4,usuario.getId());
        declaracion.executeUpdate();
        Conexion.close(declaracion, conexion);
    }
  
}
