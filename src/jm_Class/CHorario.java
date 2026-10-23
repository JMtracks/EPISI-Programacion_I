/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm_Class;
import java.time.DayOfWeek;
import java.time.LocalTime;
/**
 *
 * @author USer
 */
public class CHorario {
    private String codigoHorario;
    private DayOfWeek dia;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private CPersonal personal;

    public CHorario(String codigoHorario, DayOfWeek dia, LocalTime horaInicio, LocalTime horaFin, CPersonal personal) {
        this.codigoHorario = codigoHorario;
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.personal = personal;
    }

    public String getCodigoHorario() {
        return codigoHorario;
    }

    public void setCodigoHorario(String codigoHorario) {
        this.codigoHorario = codigoHorario;
    }

    public DayOfWeek getDia() {
        return dia;
    }

    public void setDia(DayOfWeek dia) {
        this.dia = dia;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public CPersonal getPersonal() {
        return personal;
    }

    public void setPersonal(CPersonal personal) {
        this.personal = personal;
    }
    
}
