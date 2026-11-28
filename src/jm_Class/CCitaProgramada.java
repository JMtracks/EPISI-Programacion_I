package jm_Class;

/**
 *
 * @author LIDIA
 */
import java.time.LocalDate;
import java.time.LocalDateTime;

public class CCitaProgramada extends CCita {
    private String fechaReserva;
    private boolean recordatorioEnviado;

    public CCitaProgramada() {
        super();
    }

    public CCitaProgramada(String idCita, LocalDate fecha, LocalDateTime hora,
                           String tipoCita, String fechaRegistro,
                           CPaciente paciente, CFisioterapeuta fisioterapeuta,
                           String fechaReserva) {
        super(idCita, fecha, hora, tipoCita, fechaRegistro, paciente, fisioterapeuta);
        this.fechaReserva = fechaReserva;
        this.recordatorioEnviado = false;
    }

    public String getFechaReserva() { return fechaReserva; }
    public void setFechaReserva(String fechaReserva) { this.fechaReserva = fechaReserva; }

    public boolean isRecordatorioEnviado() { return recordatorioEnviado; }
    public void setRecordatorioEnviado(boolean recordatorioEnviado) { this.recordatorioEnviado = recordatorioEnviado; }

    @Override
    public String toString() {
        return super.toString() + " | Reserva: " + fechaReserva +
               " | Recordatorio: " + (recordatorioEnviado ? "Sí" : "No");
    }
}