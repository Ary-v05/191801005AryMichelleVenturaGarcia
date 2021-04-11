/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoClientes;

import Clientes.Clientes;
import Conexion.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vegav
 */
public class DaoClientes {
    private static String SQL;
    public static List<Clientes> listaClientes() throws SQLException{
        List<Clientes> lista = new ArrayList<>();
        Connection conexion = Conexion.getConnection();
        Statement declaracion = conexion.createStatement();
        SQL = "SELECT * FROM cliente";
        ResultSet resultado = declaracion.executeQuery(SQL);
        while(resultado.next()){
            Clientes cliente = new Clientes(resultado.getInt("id"),resultado.getString("nombre"), resultado.getString("numero"));
            lista.add(cliente);
        }
        Conexion.close(conexion, declaracion, resultado);
        return lista;
    }
    public static void insert(Clientes cliente) throws SQLException{
        Connection conexion = Conexion.getConnection();
        SQL = "INSERT INTO cliente(nombre,numero) VALUES (?,?)";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setString(1, cliente.getNombre());
        declaracion.setString(2, cliente.getNumero());
        
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }  
    public static void delete(Clientes cliente) throws SQLException{
        Connection conexion = Conexion.getConnection();
        SQL = "DELETE FROM cliente WHERE id = ?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        declaracion.setInt(1, cliente.getId());
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }
    public static void update (Clientes cliente) throws SQLException{
        Connection conexion = Conexion.getConnection();
        SQL = "UPDATE cliente SET nombre = ?, numero = ? WHERE id = ?";
        PreparedStatement declaracion = conexion.prepareStatement(SQL);
        
        declaracion.setString(1, cliente.getNombre());       
        declaracion.setString(2, cliente.getNumero());
        declaracion.setInt(3, cliente.getId());
        declaracion.executeUpdate();
        Conexion.close(conexion, declaracion);
    }
    
    
}
