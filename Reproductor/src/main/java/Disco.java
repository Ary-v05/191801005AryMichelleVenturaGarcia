
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
public class Disco {
    
    //Atributos
    public String nombre;
    public String artista;
    public int anio;
    public ArrayList <Cancion> canciones;
        
    //Constructor Vacio
    public Disco(){
    }
    //COnstructor 
    public Disco(String nombre, String artista, int anio, ArrayList <Cancion> canciones){
        this.anio = anio;
        this.artista = artista;
        this.canciones = canciones;
        this.nombre = nombre;
    }
    
    @Override
    public String toString (){
        return "Año"+anio+"Artista"+artista+"Canciones"+canciones+"Nombre"+nombre;
    }
}
