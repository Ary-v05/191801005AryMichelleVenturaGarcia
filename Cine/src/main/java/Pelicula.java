/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vegav
 */
public class Pelicula {
    public String titulo,director,genero, casaProductora,clasificacion;
    public int anio;
    public double duracion;
    public boolean subtitulos;
    
    public Pelicula (){
    
    }
    
    public Pelicula (String titulo, String director, String genero, String casaProductora, String clasificacion, int anio, double duracion, boolean subtitulos){
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.casaProductora = casaProductora;
        this.clasificacion = clasificacion;
        this.anio = anio;
        this.duracion = duracion;
        this.subtitulos = subtitulos;
    }
    
    public Pelicula (String titulo){
        this.titulo = titulo;
    }
    
    @Override
    public String toString (){
        return "Titulo de la pelicula:"+titulo+"\n Director:"+ director+"\n Genero"+genero+"\n Casa Productora"+casaProductora+"\n Clasificacion"+clasificacion+"\n Año"+anio+"\n Duracion"+duracion+"\n Subtitulo"+subtitulos;
    }
    
}
