

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vegav
 */
public class TestCliente {
    public static void main(String[] args) {
        //ArrayList <Coche> coche = new ArrayList ();
       
        Coche coche = new Coche("Spark", "negro", 24587, 2020  , 120000);
        Cliente cliente = new Cliente("Ary", "Reforma", 15, 248, coche);
        
        
        System.out.println (cliente);
        
 
    }
}
