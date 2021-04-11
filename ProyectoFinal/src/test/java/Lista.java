
import Clientes.Clientes;
import DaoClientes.DaoClientes;
import java.sql.SQLException;
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
    public static void main(String[] args) throws SQLException{
        List<Clientes> listClientes = new ArrayList<>();
        listClientes = DaoClientes.listaClientes();
        
        for(Clientes cliente:listClientes){
            System.out.println(cliente);
        }
    }
}
