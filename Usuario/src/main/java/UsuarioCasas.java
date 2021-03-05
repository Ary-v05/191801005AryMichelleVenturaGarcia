/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vegav
 */
public class UsuarioCasas {
    private int id, idUsuarios;
    private String casaVieja, casaNueva, fechaCambio;

    public int getId() {
        return id;
    }

    public int getIdUsuarios() {
        return idUsuarios;
    }

    public String getCasaVieja() {
        return casaVieja;
    }

    public String getCasaNueva() {
        return casaNueva;
    }

    public String getFechaCambio() {
        return fechaCambio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdUsuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public void setCasaVieja(String casaVieja) {
        this.casaVieja = casaVieja;
    }

    public void setCasaNueva(String casaNueva) {
        this.casaNueva = casaNueva;
    }

    public void setFechaCambio(String fechaCambio) {
        this.fechaCambio = fechaCambio;
    }

    
    
    public UsuarioCasas() {
    }

    public UsuarioCasas(int id, int idUsuarios, String casaVieja, String casaNueva, String fechaCambio) {
        this.id = id;
        this.idUsuarios = idUsuarios;
        this.casaVieja = casaVieja;
        this.casaNueva = casaNueva;
        this.fechaCambio = fechaCambio;
    }

    @Override
    public String toString() {
        return "UsuarioCasas{" + "id=" + id + ", idUsuarios=" + idUsuarios + ", casaVieja=" + casaVieja + ", casaNueva=" + casaNueva + ", fechaCambio=" + fechaCambio + '}';
    }
    
    
}
