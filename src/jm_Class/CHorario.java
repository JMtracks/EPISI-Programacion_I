package jm_Class;
/**
 *
 * @author Marlon Gallarday Lara
 */

import java.time.DayOfWeek;
import java.time.LocalTime;

public class CHorario {
    private String codigoHorario;
    private DayOfWeek dia;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private CPersonal personal;

    public CHorario() {
        this.codigoHorario = "";
        this.dia = null;
        this.horaInicio = null;
        this.horaFin = null;
        this.personal = null;
    }

    public CHorario(String codigoHorario, DayOfWeek dia, LocalTime horaInicio, LocalTime horaFin, CPersonal personal) {
        setCodigoHorario(codigoHorario);
        setDia(dia);
        setHoraInicio(horaInicio);
        setHoraFin(horaFin);
        setPersonal(personal);
        validarRangoHorario();
    }

    public String getCodigoHorario() { return codigoHorario; }
    public void setCodigoHorario(String codigoHorario) {
        if (codigoHorario != null && !codigoHorario.trim().isEmpty()) this.codigoHorario = codigoHorario;
        else throw new IllegalArgumentException("Código de horario no puede estar vacío");
    }

    public DayOfWeek getDia() { return dia; }
    public void setDia(DayOfWeek dia) {
        if (dia != null) this.dia = dia;
        else throw new IllegalArgumentException("Día no puede ser nulo");
    }

    public LocalTime getHoraInicio() { return horaInicio; }
    public void setHoraInicio(LocalTime horaInicio) {
        if (horaInicio != null) this.horaInicio = horaInicio;
        else throw new IllegalArgumentException("Hora de inicio no puede ser nula");
    }

    public LocalTime getHoraFin() { return horaFin; }
    public void setHoraFin(LocalTime horaFin) {
        if (horaFin != null) this.horaFin = horaFin;
        else throw new IllegalArgumentException("Hora de fin no puede ser nula");
    }

    public CPersonal getPersonal() { return personal; }
    public void setPersonal(CPersonal personal) {
        if (personal == null) this.personal = null;
        else if (personal.getRol() != null &&
                (personal.getRol().equalsIgnoreCase("Fisioterapeuta") ||
                 personal.getRol().equalsIgnoreCase("Recepcionista"))) {
            this.personal = personal;
        } else {
            throw new IllegalArgumentException("Solo se puede asignar horario a Fisioterapeuta o Recepcionista");
        }
    }

    private void validarRangoHorario() {
        if (horaInicio != null && horaFin != null && !horaFin.isAfter(horaInicio)) {
            throw new IllegalArgumentException("Hora de fin debe ser mayor que hora de inicio");
        }
    }

    public boolean seCruza(CHorario otro) {
        if (otro == null || this.dia != otro.getDia()) return false;
        return this.horaInicio.isBefore(otro.getHoraFin()) &&
               this.horaFin.isAfter(otro.getHoraInicio());
    }

    public long getDuracionMinutos() {
        if (horaInicio == null || horaFin == null) return 0;
        return java.time.Duration.between(horaInicio, horaFin).toMinutes();
    }

    @Override
    public String toString() {
        String nombrePersonal = (personal != null) ? personal.getNombre() : "Sin asignar";
        String rolPersonal = (personal != null) ? personal.getRol() : "N/A";
        return "Horario [" + codigoHorario +
               " | Día: " + dia +
               " | De " + horaInicio + " a " + horaFin +
               " (" + getDuracionMinutos() + " min)" +
               " | Personal: " + nombrePersonal + " (" + rolPersonal + ")]";
    }
}