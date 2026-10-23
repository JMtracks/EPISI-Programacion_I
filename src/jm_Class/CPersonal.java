/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm_Class;

/**
 *
 * @author USer
 */
public class CPersonal {
    private String codigopersonal ;
    private String usuario;
    private String contraseñausuario ;
    private boolean activo;
    private String horario;

    public CPersonal(String codigopersonal, String usuario, String contraseñausuario, boolean activo, String horario) {
        this.codigopersonal = codigopersonal;
        this.usuario = usuario;
        this.contraseñausuario = contraseñausuario;
        this.activo = activo;
        this.horario = horario;
    }

    public String getCodigopersonal() {
        return codigopersonal;
    }

    public void setCodigopersonal(String codigopersonal) {
        this.codigopersonal = codigopersonal;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseñausuario() {
        return contraseñausuario;
    }

    public void setContraseñausuario(String contraseñausuario) {
        this.contraseñausuario = contraseñausuario;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
}