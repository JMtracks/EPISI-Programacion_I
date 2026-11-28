/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm_Class;
/**
 *
 * @author LIDIA
 */
import java.time.LocalDate;
import java.time.LocalDateTime;

public class CCitaInmediata extends CCita {
    private int ordenLlegada;
    private double recargoUrgencia;

    public CCitaInmediata() {
        super();
    }

    public CCitaInmediata(String idCita, LocalDate fecha, LocalDateTime hora,
                          String tipoCita, String fechaRegistro,
                          CPaciente paciente, CFisioterapeuta fisioterapeuta,
                          int ordenLlegada, double recargoUrgencia) {
        super(idCita, fecha, hora, tipoCita, fechaRegistro, paciente, fisioterapeuta);
        this.ordenLlegada = ordenLlegada;
        this.recargoUrgencia = recargoUrgencia;
    }

    public int getOrdenLlegada() { return ordenLlegada; }
    public void setOrdenLlegada(int ordenLlegada) { this.ordenLlegada = ordenLlegada; }

    public double getRecargoUrgencia() { return recargoUrgencia; }
    public void setRecargoUrgencia(double recargoUrgencia) { this.recargoUrgencia = recargoUrgencia; }

    @Override
    public String toString() {
        return super.toString() + " | Orden: " + ordenLlegada +
               " | Recargo: S/." + recargoUrgencia;
    }
}
