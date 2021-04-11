/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.*;



/**
 *
 * @author vegav
 */
public class Conexion {
    // Static es una palabra reservada que determina que el atributo es de la clase y no del objeto
    // Final es un modificador que indica que el atributo es una constante por lo que no se le podra cambiar el valor de ningun modo
    private static final String URL = "jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL ";
    private static final String USUARIO = "root", PASSWORD = "" ;
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, PASSWORD);
        // throws DQLException es el try y el catch implementado en un metodo
    }
    //Polimorfismo
    public static void close(Connection conexion) throws SQLException{
        conexion.close();
    }
    //Polimorfismo
    public static void close(Connection conexion, Statement declaracion, ResultSet resultado) throws SQLException{
        conexion.close();
        declaracion.close();
        resultado.close();
    }
    //Polimorfismo
    public static void close( Statement declaracion, Connection conexion) throws SQLException{
        declaracion.close();
        conexion.close();
    }
    //Polimorfismo
    public static void close( Statement declaracion, ResultSet resultado) throws SQLException{
        declaracion.close();
        resultado.close();
    }
    
}
