/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vegav
 */
public class Coche {
    public String marca, color;
    public int matricula, anio;
    public double precio;
    
    public Coche () {
        
    }
    
    public Coche (String marca, String color, int matricula, int anio, double precio){
        this.marca = marca;
        this.color = color;
        this.matricula = matricula;
        this.anio = anio;
        this.precio = precio;
    }
    
    @Override
    public String toString (){
        return "Marca: " + marca + "\n Matricula: " + matricula + "\n Color " + color + "\n Año: " + anio + "\n Precio: " + precio;
    }
}
