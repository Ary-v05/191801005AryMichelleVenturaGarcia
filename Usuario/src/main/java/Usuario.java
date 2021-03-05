/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vegav
 */
public class Usuario {
    private int id;
    private String nombreUsuario, contraseña, fechaDeAlta;
    private boolean status;

    public int getId() {
        return id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getFechaDeAlta() {
        return fechaDeAlta;
    }

    public boolean isStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setFechaDeAlta(String fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Usuario() {
    }

    public Usuario(int id, String nombreUsuario, String contraseña, String fechaDeAlta, boolean status) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.fechaDeAlta = fechaDeAlta;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombreUsuario=" + nombreUsuario + ", contrase\u00f1a=" + contraseña + ", fechaDeAlta=" + fechaDeAlta + ", status=" + status + '}';
    }
    
    
}
