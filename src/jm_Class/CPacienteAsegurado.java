/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package jm_Class;
/**
 *
 * @author Marlon Gallarday Lara
 */
import java.time.LocalDate;

public class CPacienteAsegurado extends CPaciente {
    private String nombreAseguradora;
    private String numeroPoliza;
    private double porcentajeCobertura;

    public CPacienteAsegurado() {
        super();
    }

    public CPacienteAsegurado(String DNI, String nombre, int edad, String codigo_p,
                               String razon_consulta, int n_atenciones, LocalDate fecha_atencion,
                               String nombreAseguradora, String numeroPoliza, double porcentajeCobertura) {
        super(DNI, nombre, edad, codigo_p, razon_consulta, n_atenciones, fecha_atencion);
        this.nombreAseguradora = nombreAseguradora;
        this.numeroPoliza = numeroPoliza;
        this.porcentajeCobertura = porcentajeCobertura;
    }

    public String getNombreAseguradora() { return nombreAseguradora; }
    public void setNombreAseguradora(String nombreAseguradora) { 
        this.nombreAseguradora = nombreAseguradora; }

    public String getNumeroPoliza() { return numeroPoliza; }
    public void setNumeroPoliza(String numeroPoliza) { 
        this.numeroPoliza = numeroPoliza; }

    public double getPorcentajeCobertura() { return porcentajeCobertura; }
    public void setPorcentajeCobertura(double porcentajeCobertura) { 
        this.porcentajeCobertura = porcentajeCobertura; }

    public double calcularCopago(double monto) {
        return monto * (1 - (porcentajeCobertura / 100));
    }

    @Override
    public String toString() {
        return super.toString() + "\nAseguradora: " + nombreAseguradora +
               "\nPóliza: " + numeroPoliza +
               "\nCobertura: " + porcentajeCobertura + "%";
    }
}