
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
public class Delete {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el id del cliente a eliminar: ");
        int id = scanner.nextInt();
        Clientes cliente = new Clientes(id);
        DaoClientes.delete(cliente);
    }
}
