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
public class CCita {
    public class Cita {
    private String idCita;
    //private Paciente paciente;
    //private Personal fisioterapeuta;
    private LocalDate fecha;
    private LocalDateTime hora;
    private String tipoCita; 
    private String estado;

        public Cita(String idCita, LocalDate fecha, LocalDateTime hora, String tipoCita) {
            setIdCita(idCita);
            setFecha(fecha);
            setHora(hora);
            setTipoCita(tipoCita);
            this.estado = "En Reserva";
        }

    public void confirmarCita() {
        this.estado = "Completada";
    }
        public String getIdCita() {
            return idCita;
        }

        public void setIdCita(String idCita) {
            this.idCita = idCita;
        }

        public LocalDate getFecha() {
            return fecha;
        }

        public void setFecha(LocalDate fecha) {
            this.fecha = fecha;
        }

        public LocalDateTime getHora() {
            return hora;
        }

        public void setHora(LocalDateTime hora) {
            this.hora = hora;
        }

        public String getTipoCita() {
            return tipoCita;
        }

        public void setTipoCita(String tipoCita) {
            this.tipoCita = tipoCita;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }
    }
}
