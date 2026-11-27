/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm_Class;
import java.time.LocalDate;

public class CPacientePrivado extends CPaciente {
    private String rucFacturacion;
    private double descuentoFrecuente;

    public CPacientePrivado() {
        super();
    }

    public CPacientePrivado(String DNI, String nombre, int edad, String codigo_p,
                            String razon_consulta, int n_atenciones, LocalDate fecha_atencion,
                            String rucFacturacion, double descuentoFrecuente) {
        super(DNI, nombre, edad, codigo_p, razon_consulta, n_atenciones, fecha_atencion);
        this.rucFacturacion = rucFacturacion;
        this.descuentoFrecuente = descuentoFrecuente;
    }

    public String getRucFacturacion() { return rucFacturacion; }
    public void setRucFacturacion(String rucFacturacion) { 
        this.rucFacturacion = rucFacturacion; }

    public double getDescuentoFrecuente() { return descuentoFrecuente; }
    public void setDescuentoFrecuente(double descuentoFrecuente) { 
        this.descuentoFrecuente = descuentoFrecuente; }

    public double aplicarDescuento(double monto) {
        return monto * (1 - (descuentoFrecuente / 100));
    }

    @Override
    public String toString() {
        return super.toString() + "\nRUC: " + rucFacturacion +
               "\nDescuento: " + descuentoFrecuente + "%";
    }
}