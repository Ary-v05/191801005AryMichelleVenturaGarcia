/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vegav
 */
public class TestAka {
    
    public static void main(String[] args) {
        //crear un objeto (instanciar una clase)
        Aka cobre = new Aka();
        cobre.material = "cobre"; 
        cobre.disponibilidad = "alta";
        cobre.municion = 5;
        cobre.precio = 10;
        cobre.velocidadDisparo = 10.5;
        cobre.danio = 5;
        System.out.println(cobre.mostrarCaracteristicas());
    }
    
}
