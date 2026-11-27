/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm_Class;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Clase Cita (CCita)
 * @author JMTracks (Manrique Galvez Ernesto Joel)
 */
public class CCita extends CTransaccion {
    private String idCita;
    private LocalDate fecha;
    private LocalDateTime hora;
    private String tipoCita;

    public CCita() {
        super();
        this.estado = "En Reserva";
    }

    public CCita(String idCita, LocalDate fecha, LocalDateTime hora, String tipoCita, String fechaRegistro) {
        super(fechaRegistro);
        setIdCita(idCita);
        setFecha(fecha);
        setHora(hora);
        setTipoCita(tipoCita);
        this.estado = "En Reserva";
    }

    public void confirmarCita() { this.estado = "Completada"; }

    public void cancelarCita(LocalDate fechaActual) {
        if (fechaActual.isBefore(fecha)) this.estado = "Ausente";
    }

    public void cancelarCita() { this.estado = "Ausente"; }

    public String getIdCita() { return idCita; }
    public void setIdCita(String idCita) { this.idCita = idCita; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public LocalDateTime getHora() { return hora; }
    public void setHora(LocalDateTime hora) { this.hora = hora; }

    public String getTipoCita() { return tipoCita; }
    public void setTipoCita(String tipoCita) { this.tipoCita = tipoCita; }

    @Override
    public String toString() {
        return "Cita [ID: " + idCita +
               " | Fecha: " + fecha +
               " | Hora: " + hora +
               " | Tipo: " + tipoCita +
               " | Estado: " + estado + "]";
    }
}
