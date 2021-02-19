
import hardware.Ram;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vegav
 */
public class TestRam {
    public static void main(String[] args) {
        Ram ram = new Ram (8, "SRAM", "Adata");
        
        System.out.println(ram);
        ram.setAlmacenamiento(16);
        ram.setTipo("DRAM");
        ram.setMarca("Hyper X");
        System.out.println(ram);
        
    }
    
}
