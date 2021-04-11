
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
public class Insert {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nombre del cliente: ");
        String nombreCliente = scanner.nextLine();
        System.out.println("Ingresa el numero del cliente: ");
        String numero = scanner.nextLine();
        Clientes cliente = new Clientes (nombreCliente, numero);
        DaoClientes.insert(cliente);
        System.out.println(cliente);
    }
}
