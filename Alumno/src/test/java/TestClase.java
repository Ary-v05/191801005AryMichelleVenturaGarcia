/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vegav
 */
public class TestClase {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Ary", "Ventura", "Garcia", 19);
        Clase clase = new Clase("Mate", alumno);
        System.out.println(clase);
        
        clase.setNombre("Fisica");
        System.out.println(clase);
        
        alumno.setNombre("Lyn");
        System.out.println(clase);
    }
}
