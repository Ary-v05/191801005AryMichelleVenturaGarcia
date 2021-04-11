/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Equipo;

/**
 *
 * @author vegav
 */
public class Equipo {
    private int id;
    private String nombre;
    private String reparacion;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getReparacion() {
        return reparacion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setReparacion(String reparacion) {
        this.reparacion = reparacion;
    }

    public Equipo() {
    }

    public Equipo(int id, String nombre, String reparacion) {
        this.id = id;
        this.nombre = nombre;
        this.reparacion = reparacion;
    }
    public Equipo(String nombre, String reparacion) {
        this.nombre = nombre;
        this.reparacion = reparacion;
    }

    @Override
    public String toString() {
        return "\t" + "id asociado al Cliente: " + id  +" "+ nombre + ", Reparacion: " + reparacion ;
    }
    
    public String imprimir() {
        return "Equipo{" + "id=" + id  + ", nombre=" + nombre + ", reparacion=" + reparacion + '}';
    }
    
    
    
}
