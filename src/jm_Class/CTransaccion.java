package jm_Class;

/**
 *
 * @author LIDIA
 */
public class CTransaccion {
    protected String fechaRegistro;
    protected String estado;
    protected double montoTotal;

    public CTransaccion() {
        this.fechaRegistro = "";
        this.estado = "Pendiente";
        this.montoTotal = 0.0;
    }

    public CTransaccion(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
        this.estado = "Pendiente";
        this.montoTotal = 0.0;
    }

    public String getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(String fechaRegistro) { this.fechaRegistro = fechaRegistro; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public double getMontoTotal() { return montoTotal; }
    public void setMontoTotal(double montoTotal) { this.montoTotal = montoTotal; }

    public double calcularTotal() {
        return montoTotal;
    }

    public void mostrarResumen() {
        System.out.println("Transacción | Fecha: " + fechaRegistro +
                           " | Estado: " + estado +
                           " | Total: S/." + montoTotal);
    }
}