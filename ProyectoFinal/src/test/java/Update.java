
import Clientes.Clientes;
import DaoClientes.DaoClientes;
import java.sql.SQLException;
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
public class Update {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/nootbook?zeroDateTimeBehavior=CONVERT_TO_NULL ";
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el id del usuario a actulizar:");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("Actualice el nombre del Cliente:");
        String nombre = scan.nextLine();
        System.out.println("Actualice el numero del cliente: ");
        String numero = scan.nextLine();
        
        Clientes cliente = new Clientes(id, nombre, numero);
        DaoClientes.update(cliente);
    }
}
