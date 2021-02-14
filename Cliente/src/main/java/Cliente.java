
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
public class Cliente {
    public String nombre, direccion;
    public int dni, telefono;
    public Coche coche;
    
    public Cliente (){
        
    }
    
    public Cliente (String nombre, String direccion, int dni, int telefono,Coche coche ){
        this.nombre = nombre;
        this.direccion = direccion;
        this.dni = dni;
        this.telefono = telefono;
        this.coche = coche;
    }

   
    @Override
    public String toString(){
        return "Nombre: "+nombre+"\nDireccion: "+direccion+"\nDni: "+dni+"\nTelefono: "+telefono+"\nCoche: "+coche;
    }
   
    
    
}
