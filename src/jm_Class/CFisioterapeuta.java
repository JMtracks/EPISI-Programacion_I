/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm_Class;

/**
 *
 * @author RAMOS VILCHEZ VICTOR MIGUEL
 */
public class CFisioterapeuta extends CPersonal {
    private String codigo_fisioterapeuta;
    private String especialidad;
    private int sesiones_realizadas;
    private int pacientes_en_agenda;
    private boolean disponible;

    public CFisioterapeuta() {
        super();
    }

    public CFisioterapeuta(String DNI, String nombre, int edad, String usuario, String contrasena,
                            String horario, String codigo_fisioterapeuta, String especialidad,
                            int sesiones_realizadas, int pacientes_en_agenda) {
        super(DNI, nombre, edad, "Fisioterapeuta", usuario, contrasena, horario);
        this.codigo_fisioterapeuta = codigo_fisioterapeuta;
        this.especialidad = especialidad;
        this.sesiones_realizadas = sesiones_realizadas;
        this.pacientes_en_agenda = pacientes_en_agenda;
        this.disponible = true;
    }

    public String getCodigo_fisioterapeuta() { return codigo_fisioterapeuta; }
    public void setCodigo_fisioterapeuta(String codigo_fisioterapeuta) { this.codigo_fisioterapeuta = codigo_fisioterapeuta; }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public int getSesiones_realizadas() { return sesiones_realizadas; }
    public void setSesiones_realizadas(int sesiones_realizadas) { this.sesiones_realizadas = sesiones_realizadas; }

    public int getPacientes_en_agenda() { return pacientes_en_agenda; }
    public void setPacientes_en_agenda(int pacientes_en_agenda) { this.pacientes_en_agenda = pacientes_en_agenda; }

    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    @Override
    public String toString() {
        return "Fisioterapeuta [Código: " + codigo_fisioterapeuta +
               " | Nombre: " + getNombre() +
               " | Especialidad: " + especialidad +
               " | Sesiones: " + sesiones_realizadas +
               " | Pacientes en agenda: " + pacientes_en_agenda + "]";
    }
}