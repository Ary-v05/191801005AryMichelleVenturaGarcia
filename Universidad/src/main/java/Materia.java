/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vegav
 */
public class Materia {
    private String nombre, carrera, id;
    private int creditos;
    public String getNombre(){
        return this.nombre;
    }
    public String getCarrera(){
        return this.carrera;
    }
    public String getId(){
        return this.id;
    }
    public int getCreditos(){
        return this.creditos;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setCarrera(String carrera){
        this.carrera = carrera;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setCreditos(int creditos){
        this.creditos = creditos;
    }
    public Materia(){
        
    }
    public Materia(String nombre,String carrera, String id, int creditos){
        this.nombre = nombre;
        this.carrera = carrera;
        this.id = id;
        this.creditos = creditos;
    }
    @Override
    public String toString(){
        return "Materia: "+ nombre + "\nCarrera: " + carrera+ "\nId " + id + "\ncreditos"+ creditos; 
    }
    
}
