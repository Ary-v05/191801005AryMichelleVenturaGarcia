/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vegav
 */
public class TestMateria {
    public static void main(String[] args) {
        Materia materia = new Materia("Fisica", "tec", "TECFI", 5);
        System.out.println(materia);
        materia.setNombre("POO");
        System.out.println(materia);
    }
}
