    
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
public class Cine {
    public String nombre;
    public int horaInicio, horaFin;
    public ArrayList <Pelicula> peliculas= new ArrayList();
    
    public Cine (){
        
    }
    public Cine(String nombre, int horaInicio, int horaFin){
        this.nombre= nombre;
        this.horaFin = horaFin;
        this.horaInicio= horaInicio;
        //this.peliculas = null;
    }
    
    public Cine (String nombre, int horaInicio, int horaFin, ArrayList <Pelicula> peliculas ){
        this.nombre = nombre;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.peliculas = peliculas;
    }
    
    // Regresa el tamaño de las peliculas
    public String tamanoPeliculas (){
        return "La cantidad de Peliculas en el cine son:"+ peliculas.size();
    }
    
    
    //Metodo agregarPeliculas
    public void agregarPelicula (Pelicula pelicula){
        peliculas.add (pelicula);
    }
    
    // Regresa el Menu de Peliculas
    public String menuCartelera(){
        String menu = "";
        int i=1;
        for(Pelicula pelicula:peliculas){
            menu += "\t"+ i+": "+ pelicula.titulo+ "\n";
            i++;
        }
        return "\t Menu de Peliculas \n" + menu;
    }
    
    // Abierto o cerrado
    public void horario (int horaInicio, int horaFIn){
        this.horaInicio = 9;
        this.horaFin = 24;
    
    }
    
    @Override
    public String toString (){
        return "Nombre de la pelicula: "+ nombre; 
    }
    
    
}
