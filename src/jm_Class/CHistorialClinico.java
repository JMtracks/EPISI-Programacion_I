package jm_Class;

/**
 *
 * @author USer
 */
public class CHistorialClinico {
    private String codigoHistorial;
    private String fechaApertura;
    private String observacionesGenerales;
    private String diagnostico;
    private String tratamiento;

    public CHistorialClinico() {
        this.codigoHistorial = "";
        this.fechaApertura = "";
        this.observacionesGenerales = "";
        this.diagnostico = "";
        this.tratamiento = "";
    }

    public CHistorialClinico(String codigoHistorial, String fechaApertura) {
        setCodigoHistorial(codigoHistorial);
        setFechaApertura(fechaApertura);
        this.observacionesGenerales = "";
        this.diagnostico = "";
        this.tratamiento = "";
    }

    public CHistorialClinico(String codigoHistorial, String fechaApertura,
                              String observacionesGenerales, String diagnostico, String tratamiento) {
        setCodigoHistorial(codigoHistorial);
        setFechaApertura(fechaApertura);
        setObservacionesGenerales(observacionesGenerales);
        setDiagnostico(diagnostico);
        setTratamiento(tratamiento);
    }

    public String getCodigoHistorial() { return codigoHistorial; }
    public void setCodigoHistorial(String codigoHistorial) {
        if (codigoHistorial == null || codigoHistorial.trim().isEmpty())
            throw new IllegalArgumentException("Código del historial no puede estar vacío");
        this.codigoHistorial = codigoHistorial;
    }

    public String getFechaApertura() { return fechaApertura; }
    public void setFechaApertura(String fechaApertura) {
        if (!esFechaValida(fechaApertura))
            throw new IllegalArgumentException("Fecha debe tener formato dd/MM/yyyy");
        this.fechaApertura = fechaApertura;
    }

    public String getObservacionesGenerales() { return observacionesGenerales; }
    public void setObservacionesGenerales(String observacionesGenerales) {
        if (observacionesGenerales == null)
            throw new IllegalArgumentException("Observaciones no pueden ser nulas");
        this.observacionesGenerales = observacionesGenerales;
    }

    public String getDiagnostico() { return diagnostico; }
    public void setDiagnostico(String diagnostico) {
        if (diagnostico == null)
            throw new IllegalArgumentException("Diagnóstico no puede ser nulo");
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() { return tratamiento; }
    public void setTratamiento(String tratamiento) {
        if (tratamiento == null)
            throw new IllegalArgumentException("Tratamiento no puede ser nulo");
        this.tratamiento = tratamiento;
    }

    private boolean esFechaValida(String fecha) {
        if (fecha == null || fecha.length() != 10) return false;
        if (fecha.charAt(2) != '/' || fecha.charAt(5) != '/') return false;

        String dia = fecha.substring(0, 2);
        String mes = fecha.substring(3, 5);
        String año = fecha.substring(6, 10);

        if (!esNumero(dia) || !esNumero(mes) || !esNumero(año)) return false;

        int d = Integer.parseInt(dia);
        int m = Integer.parseInt(mes);
        int a = Integer.parseInt(año);

        if (a < 1900 || a > 2100) return false;
        if (m < 1 || m > 12) return false;
        if (d < 1 || d > 31) return false;

        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (esBisiesto(a)) diasPorMes[1] = 29;

        return d <= diasPorMes[m - 1];
    }

    private boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }

    private boolean esNumero(String texto) {
        if (texto.isEmpty()) return false;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) < '0' || texto.charAt(i) > '9') return false;
        }
        return true;
    }

    public void agregarObservacion(String nuevaObservacion) {
        if (nuevaObservacion == null || nuevaObservacion.trim().isEmpty())
            throw new IllegalArgumentException("Observación no puede estar vacía");
        if (this.observacionesGenerales.isEmpty()) this.observacionesGenerales = nuevaObservacion;
        else this.observacionesGenerales += " | " + nuevaObservacion;
    }

    public void actualizarDiagnostico(String nuevoDiagnostico) { setDiagnostico(nuevoDiagnostico); }
    public void actualizarTratamiento(String nuevoTratamiento) { setTratamiento(nuevoTratamiento); }

    @Override
    public String toString() {
        return "HistorialClinico [Código: " + codigoHistorial +
               " | Apertura: " + fechaApertura +
               " | Diagnóstico: " + diagnostico +
               " | Tratamiento: " + tratamiento +
               " | Observaciones: " + observacionesGenerales + "]";
    }
}
