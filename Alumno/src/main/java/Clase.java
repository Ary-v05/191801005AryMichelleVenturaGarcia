/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vegav
 */
public class Clase {
    private String nombre;
    private Alumno alumno;
    
    public String getNombre(){
        return this.nombre;
    }
    public Alumno getAlumno(){
        return this.alumno;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setAlumno(Alumno alumno){
        this.alumno= alumno;
       
    }
    
    public Clase(){
        
    }
    public Clase(String nombre, Alumno alumno){
        this.nombre = nombre;
        this.alumno = alumno;
    }
    
    @Override
    public String toString(){
       return "Nombre de la clase: "+nombre+"\nAlumno: "+alumno; 
    }
}
