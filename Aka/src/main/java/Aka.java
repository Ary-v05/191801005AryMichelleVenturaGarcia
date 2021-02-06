/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vegav
 */
public class Aka { 
    
    // Atributos
    public String material,disponibilidad;
    public int municion;
    public double velocidadDisparo, danio, precio; 
    
    // Metodos
    public String mostrarCaracteristicas(){
        
    return "El material del arma es de " +material+ "con una disponibilidad de" + disponibilidad + "Con una municion de" + municion + "Con una velocidad de disparo" + velocidadDisparo + "con un danio de " + danio + "con un precio de" + precio;
    
    }
    
}
