package jm_Class;

/**
 *
 * @author LIDIA
 */
public class CSesionTerapia extends CTransaccion {
    private String codigoSesion;
    private int duracionMinutos;
    private String tipoTratamiento;
    private String observaciones;
    private String diagnostico;
    private CFisioterapeuta fisioterapeuta; // ASOCIACIÓN

    public CSesionTerapia() {
        super();
    }

    public CSesionTerapia(String codigoSesion, int duracionMinutos,
                           String tipoTratamiento, String observaciones, String diagnostico,
                           String fechaRegistro, CFisioterapeuta fisioterapeuta) {
        super(fechaRegistro);
        this.codigoSesion = codigoSesion;
        this.duracionMinutos = duracionMinutos;
        this.tipoTratamiento = tipoTratamiento;
        this.observaciones = observaciones;
        this.diagnostico = diagnostico;
        this.fisioterapeuta = fisioterapeuta;
        this.montoTotal = calcularTotal();
    }

    public String getCodigoSesion() { return codigoSesion; }
    public void setCodigoSesion(String codigoSesion) { this.codigoSesion = codigoSesion; }

    public int getDuracionMinutos() { return duracionMinutos; }
    public void setDuracionMinutos(int duracionMinutos) { this.duracionMinutos = duracionMinutos; }

    public String getTipoTratamiento() { return tipoTratamiento; }
    public void setTipoTratamiento(String tipoTratamiento) { this.tipoTratamiento = tipoTratamiento; }

    public String getObservaciones() { return observaciones; }
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }

    public String getDiagnostico() { return diagnostico; }
    public void setDiagnostico(String diagnostico) { this.diagnostico = diagnostico; }

    public CFisioterapeuta getFisioterapeuta() { return fisioterapeuta; }
    public void setFisioterapeuta(CFisioterapeuta fisioterapeuta) { this.fisioterapeuta = fisioterapeuta; }

    @Override
    public double calcularTotal() { return duracionMinutos * 2.5; }

    @Override
    public void mostrarResumen() {
        System.out.println("SESIÓN DE TERAPIA");
        System.out.println("Código: " + codigoSesion);
        System.out.println("Fecha: " + fechaRegistro);
        System.out.println("Duración: " + duracionMinutos + " min");
        System.out.println("Tratamiento: " + tipoTratamiento);
        System.out.println("Fisioterapeuta: " + (fisioterapeuta != null ? fisioterapeuta.getNombre() : "Sin asignar"));
        System.out.println("Costo: S/." + calcularTotal());
    }
}