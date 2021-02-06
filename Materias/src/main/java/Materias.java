/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vegav
 */
public class Materias {
    
    //Atributos
    public String nombreMateria;
    public String carreraMateria;
    public int creditosMateria;
    public String codigoMateria;
    public int cuatrimestre; 
    
    //Constructor Vacio 
    public Materias (){
    }
    // Constructor
    public Materias (String nombreMateria, String carreraMateria, int creditosMateria, String codigoMateria, int cuatrimestre){
        this.carreraMateria = carreraMateria;
        this.codigoMateria = codigoMateria;
        this.creditosMateria = creditosMateria;
        this.cuatrimestre = cuatrimestre;
        this.nombreMateria = nombreMateria;
    }
    
    @Override
    public String toString (){
        return "Carrera: "+carreraMateria+"\n Codigo"+codigoMateria+"\n Creditos"+creditosMateria+"\n Cuatrimestre"+cuatrimestre+"\n Nombre de la Materia"+nombreMateria;
    }
}
