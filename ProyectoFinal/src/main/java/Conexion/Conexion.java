package Conexion;



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
public class Conexion {
    
    private static final String URL = "jdbc:mysql://localhost:3306/nootbook?zeroDateTimeBehavior=CONVERT_TO_NULL ";
    private static final String USUARIO = "root", PASSWORD = "";
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USUARIO, PASSWORD);
        //throws SQLException es el try y cache implementado en un metodo
    }
    //polimorfismo
    public static void close(Connection conexion) throws SQLException{
        conexion.close();
    }
    //polimorfismo
    public static void close(Connection conexion, Statement declaracion, ResultSet resultado ) throws SQLException{
        conexion.close();
        declaracion.close();
        resultado.close();
    }
    //polimorfismo
    public static void close( Connection conexion, Statement declaracion) throws SQLException{
        declaracion.close();
        conexion.close();
    }
}
