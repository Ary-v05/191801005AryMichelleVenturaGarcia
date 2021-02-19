
import hardware.Bateria;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vegav
 */
public class TestBateria {
    public static void main(String[] args) {
        // instanciar es crear un objeto
        // Partes para instanciar un objeto
        // 1= clase, 2= nombre del objeto , 3= constructor "completo o vacio"
        // clase
        Bateria bateria = new Bateria (100);
     
        
        System.out.println(bateria);
        // modifica
        bateria.setPorcentaje(99);
        System.out.println(bateria);
        
    }
}
