/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vegav
 */
public class Cancion {
    
    //Atributos
    public int orden;
    public String titulo;
    public double duracion;
    
    
    //Metodos
    //Constructor
    public Cancion (int orden, String titulo, double duracion){
        this.duracion = duracion;
        this.orden = orden;
        this.titulo = titulo;
    
    }
    
    //COsntructor vacio
    public Cancion (){
        this.duracion = 0.0;
        this.orden = 0;
        this.titulo = "";
    }
    //Metodo toString
    @Override
    public String toString (){
        return "Orden : "+orden+"Duracion : "+duracion+"Titulo: "+titulo;
        
    }
}
