/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vegav
 */
public class Chocolates {
    
    //Atributos
    public String nombreChocolate;
    public String ingredientes;
    public int cantidad;
    public double precio;
    
    //Constructor Vacio
    public Chocolates() {
    }
    
    //Constructor 
    public Chocolates (String nombreChocolate, String tipo, int cantidad, double precio){
        this.nombreChocolate = nombreChocolate;
        this.ingredientes = tipo;
        this.cantidad = cantidad;
        this.precio = precio;
        
    }
    
    @Override
    public String toString (){
        return "Nombre del chocolate:"+nombreChocolate+"\n Ingredientes: "+ingredientes+"\n Cantidad de Gramos:"+cantidad+"\n Precio:"+precio;
    }
}
