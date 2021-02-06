
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vegav
 */
public class TestDisco {
    public static void main(String[] args) {
        ArrayList <Cancion> canciones = new ArrayList ();
        Cancion cancion1 = new Cancion (1, "Como una novela",3.46);
        Cancion cancion2 = new Cancion (2, "Contra el Dragon", 3.48);
        Cancion cancion3 = new Cancion (3, "Viri vir bambam", 3.50);
        canciones.add(cancion1);
        canciones.add(cancion2);
        canciones.add(cancion3);
        
        String nombre = "Lo mas romantico de los Acosta";
        Disco losAcosta = new Disco (nombre, "Los acosta", 2005, canciones);
        System.out.println(losAcosta);
    }
}
