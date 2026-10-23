/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm_Class;

/**
 *
 * @author RAMOS VILCHEZ VICTOR MIGUEL
 */
public class CFisioterapeuta {
    
  // Atributos
    private String codigo_fisioterapeuta;
    private String nombre;
    private String especialidad;
    private int sesiones_realizadas;
    private int pacientes_en_agenda;

    // Constructor con parámetros
    public CFisioterapeuta(String codigo_fisioterapeuta, String nombre, String especialidad, int sesiones_realizadas, int pacientes_en_agenda) {
        this.codigo_fisioterapeuta = codigo_fisioterapeuta;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.sesiones_realizadas = sesiones_realizadas;
        this.pacientes_en_agenda = pacientes_en_agenda;
    }

    // Constructor vacío
    public CFisioterapeuta() {
    }

    // Getters y Setters
    public String getCodigo_fisioterapeuta() {
        return codigo_fisioterapeuta;
    }

    public void setCodigo_fisioterapeuta(String codigo_fisioterapeuta) {
        this.codigo_fisioterapeuta = codigo_fisioterapeuta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getSesiones_realizadas() {
        return sesiones_realizadas;
    }

    public void setSesiones_realizadas(int sesiones_realizadas) {
        this.sesiones_realizadas = sesiones_realizadas;
    }

    public int getPacientes_en_agenda() {
        return pacientes_en_agenda;
    }

    public void setPacientes_en_agenda(int pacientes_en_agenda) {
        this.pacientes_en_agenda = pacientes_en_agenda;
    }

    @Override
    public String toString() {
        return "Información del Fisioterapeuta:" +
               "\nCódigo: " + codigo_fisioterapeuta +
               "\nNombre: " + nombre +
               "\nEspecialidad: " + especialidad +
               "\nSesiones Realizadas: " + sesiones_realizadas +
               "\nPacientes en Agenda: " + pacientes_en_agenda;
    }
}