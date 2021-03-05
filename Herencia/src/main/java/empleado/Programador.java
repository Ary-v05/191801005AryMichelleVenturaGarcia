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
public class Programador extends Empleado {
    
    private double sueldo;
    
    public Programador() {
        super();
        this.sueldo = 0;
    }
    
    public Programador(String nombre, String apellidoPaterno, String apellidoMaterno, int dni, double sueldo) {
        
        super(nombre, apellidoPaterno, apellidoMaterno, dni);
        this.sueldo= sueldo;
    }
    
    
}
