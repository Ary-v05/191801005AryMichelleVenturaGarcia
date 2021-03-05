/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vegav
 */
public class Alumno {
    private String nombre, apellidoPaterno, apellidoMaterno;
    private int edad;
    
    public String getNombre(){
        return this.nombre;
    }
    public String getApellidoPaterno(){
        return this.apellidoPaterno;
    }
    public String getApellidoMaterno(){
        return this.apellidoMaterno;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellidoPaterno(String apellidoPaterno){
        this.apellidoPaterno = apellidoPaterno;
    }
    public void setApellidoMaterno(String apellidoMaterno){
        this.apellidoMaterno = apellidoMaterno;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public Alumno (){
        
    }
    
    public Alumno(String nombre, String apellidoPaterno, String apellidoMaterno, int edad){
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
    }
    
    @Override
    public String toString(){
       return "Nombre: "+nombre+"\nApellido Paterno: "+apellidoPaterno+"\nApellido Materno: "+apellidoMaterno+"\nEdad: "+edad; 
    }
}

