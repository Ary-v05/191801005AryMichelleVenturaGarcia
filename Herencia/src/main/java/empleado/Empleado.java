/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

/**
 *
 * @author vegav
 */
public class Empleado {
    
    private String nombre, apellidoPaterno, apellidoMaterno;
    private int dni;
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellidoPaterno(){
        return this.apellidoPaterno;
    }
    
    public String getApellidoMaterno(){
        return this.apellidoMaterno;
    }
    
    public int getDni(){
        return this.dni;
    }
    
   
    
    public Empleado() {
        
    }
    
    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, int dni) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.dni = dni;
    }
    
    @Override
    public String toString() {
        return "Nombre: "+ nombre+ "\n Apellido Paterno: "+ apellidoPaterno+ "\nApellido Materno: "+apellidoMaterno + "\nDni: "+ dni;
    }
}
