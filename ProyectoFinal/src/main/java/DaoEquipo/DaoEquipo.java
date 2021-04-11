/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoEquipo;



import Conexion.Conexion;
import Equipo.Equipo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vegav
 */
public class DaoEquipo {
    private static String SQL;
    public static List<Equipo> listaEquipo() throws SQLException{
        List<Equipo> lista = new ArrayList<>();
        Connection conexion = Conexion.getConnection();
        Statement declaracion = conexion.createStatement();
        SQL = "SELECT * FROM equipo";
        ResultSet resultado = declaracion.executeQuery(SQL);
        while(resultado.next()){
            Equipo equipo = new Equipo(resultado.getInt("id"),resultado.getString("nombre"), resultado.getString("reparacion"));
            lista.add(equipo);
        }
        Conexion.close(conexion, declaracion, resultado);
        return lista;
    }
    public static void insert(Equipo equipo) throws SQLException{
        Connection conexion = Conexion.getConnection();
        SQL = "INSERT INTO equipo(nombre,reparacion) VALUES (?,?)";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setString(1, equipo.getNombre());
        declaracion.setString(2, equipo.getReparacion());
        
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }
    public static void delete(Equipo equipo) throws SQLException{
        Connection conexion = Conexion.getConnection();
        SQL = "DELETE FROM equipo WHERE id = ?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        declaracion.setInt(1, equipo.getId());
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }
    public static void update (Equipo equipo) throws SQLException{
        Connection conexion = Conexion.getConnection();
        SQL = "UPDATE equipo SET nombre = ?, reparacion = ? WHERE id = ?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setString(1, equipo.getNombre());       
        declaracion.setString(2, equipo.getReparacion());
        declaracion.setInt(3, equipo.getId());
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }
}
