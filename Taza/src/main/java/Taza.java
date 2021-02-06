/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vegav
 */
public class Taza {
    
    //Atributos
    public String color, modelo, material,tamano;
    public double precio;
    
    
    //Metodos
    // COnstructores
    public Taza (String color, double precio, String modelo, String material, String tamano){
        this.color = color;
        this.material = material;
        this.modelo = modelo;
        this.tamano = tamano;
        this.precio = precio;
        
    }
    public Taza (){
        this.color = "";
        this.material = "";
        this.modelo = "";
        this.precio = 0;
        this.tamano = "";
    }
    // Metodo toString
    
    @Override
    public String toString () {
        return "La taza es de color"+color+",modelo"+modelo+",de material"+material+",con precio"+precio+",de tamaño"+tamano;
    
    }
}
