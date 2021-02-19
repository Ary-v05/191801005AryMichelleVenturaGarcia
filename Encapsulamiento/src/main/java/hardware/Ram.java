/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hardware;

/**
 *
 * @author vegav
 */
public class Ram {
    private int almacenamiento;
    private String tipo;
    private String marca;
    
    public int getAlmacenamiento (){
        return this.almacenamiento;
    }
    public String getTipo (){
        return this.tipo;
    }
    public String getMarca (){
        return this.marca;
    }
    public void setAlmacenamiento (int almacenamiento){
        this.almacenamiento = almacenamiento;
    }
    public void setTipo (String tipo){
        this.tipo = tipo;
    }
    public void setMarca (String marca){
        this.marca = marca;
    }
    
    public Ram (){
        this.almacenamiento = 8;
        this.tipo = "SRAM";
        this.marca = "Adata";
    }
    
    public Ram (int almacenamiento, String tipo, String marca){
        this.almacenamiento = almacenamiento;
        this.tipo = tipo;
        this.marca = marca;
                
    }
    
    @Override
    public String toString(){
        return "Tipo: "+ tipo+ "\nAlmacenamiento: "+ almacenamiento+ "\nMarca: "+ marca;
    }
}

