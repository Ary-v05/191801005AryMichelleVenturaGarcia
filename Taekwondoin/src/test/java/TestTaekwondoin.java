/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vegav
 */
public class TestTaekwondoin {
    
    public static void main(String[] args) {
        //crear un objeto (instanciar una clase)
        Taekwondoin cinta = new Taekwondoin ();
        cinta.cinta = "Blanca";
        cinta.danioDeGolpe = 1;
        cinta.danioDePatada = 1;
        cinta.potenciaDeGolpe = 1;
        cinta.potenciaDePatada = 1;
        cinta.precisionDeGolpe = "Bajo";
        cinta.precisionDePatada = "Bajo";
        cinta.velocidadDeGolpe = "Bajo";
        cinta.velocidadDePatada = "Bajo";
        System.out.println(cinta);
    }
}
