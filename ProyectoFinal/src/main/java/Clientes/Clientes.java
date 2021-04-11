/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientes;

/**
 *
 * @author vegav
 */
public class Clientes {
    private int id;
    private String nombre;
    private String numero;

    public int getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Clientes() {
    }

    public Clientes(int id, String nombre, String numero) {
        this.id = id;
        this.nombre = nombre;
        this.numero = numero;
    }

    public Clientes(int id) {
        this.id = id;
    }

    public Clientes(String nombre, String numero) {       
        this.nombre = nombre;
        this.numero = numero;
    }
    

    @Override
    public String toString() {
        return "Id: " + id + ", Nombre: " + nombre + ", Numero: " + numero  ;
    }
    
    
}
