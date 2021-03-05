/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vegav
 */
public class Mago extends Personajes {
    private String poder;
    private int danio;

    public String getPoder() {
        return poder;
    }

    public int getDanio() {
        return danio;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    public Mago() {
    }

    public Mago(String poder, int danio, int id, int vida, String nombre, String raza) {
        super(id, vida, nombre, raza);
        this.poder = poder;
        this.danio = danio;
    }

    @Override
    public String toString() {
        return "Mago:" + "\npoder: " + poder + "\ndanio: " + danio+ super.toString();
    }
    
    
}
