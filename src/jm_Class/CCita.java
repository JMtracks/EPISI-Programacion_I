/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm_Class;
/**
 * Clase Cita (CCita)
 * @author JMTracks (Manrique Galvez Ernesto Joel)
 */
import java.time.LocalDate;
import java.time.LocalDateTime;

public class CCita extends CTransaccion {
    private String idCita;
    private LocalDate fecha;
    private LocalDateTime hora;
    private String tipoCita;
    private CPaciente paciente;        // ASOCIACIÓN
    private CFisioterapeuta fisioterapeuta; // ASOCIACIÓN

    public CCita() {
        super();
        this.estado = "En Reserva";
    }

    public CCita(String idCita, LocalDate fecha, LocalDateTime hora, String tipoCita,
                 String fechaRegistro, CPaciente paciente, CFisioterapeuta fisioterapeuta) {
        super(fechaRegistro);
        setIdCita(idCita);
        setFecha(fecha);
        setHora(hora);
        setTipoCita(tipoCita);
        this.paciente = paciente;
        this.fisioterapeuta = fisioterapeuta;
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

    public CPaciente getPaciente() { return paciente; }
    public void setPaciente(CPaciente paciente) { this.paciente = paciente; }

    public CFisioterapeuta getFisioterapeuta() { return fisioterapeuta; }
    public void setFisioterapeuta(CFisioterapeuta fisioterapeuta) { this.fisioterapeuta = fisioterapeuta; }

    @Override
    public String toString() {
        return "Cita [ID: " + idCita +
               " | Fecha: " + fecha +
               " | Hora: " + hora +
               " | Tipo: " + tipoCita +
               " | Estado: " + estado +
               " | Paciente: " + (paciente != null ? paciente.getNombre() : "Sin asignar") +
               " | Fisioterapeuta: " + (fisioterapeuta != null ? fisioterapeuta.getNombre() : "Sin asignar") + "]";
    }
}
