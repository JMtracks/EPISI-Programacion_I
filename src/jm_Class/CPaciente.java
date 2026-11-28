/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm_Class;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CPaciente extends CPersona {
    private static int total_pacientes = 0;
    private String codigo_p;
    private String razon_consulta;
    private int n_atenciones;
    private LocalDate fecha_atencion;
    private CHistorialClinico historial; // COMPOSICIÓN

    public CPaciente() {
        super();
        this.historial = new CHistorialClinico(); // Se crea junto con el paciente
        total_pacientes++;
    }

    public CPaciente(String DNI, String nombre, int edad, String codigo_p,
                     String razon_consulta, int n_atenciones, LocalDate fecha_atencion) {
        super(DNI, nombre, edad);
        this.codigo_p = codigo_p;
        this.razon_consulta = razon_consulta;
        this.n_atenciones = n_atenciones;
        this.fecha_atencion = fecha_atencion;
        this.historial = new CHistorialClinico(); // COMPOSICIÓN
        total_pacientes++;
    }

    public static int getTotal_pacientes() { return total_pacientes; }
    public static void setTotal_pacientes(int total) { CPaciente.total_pacientes = total; }

    public String getCodigo_p() { return codigo_p; }
    public void setCodigo_p(String codigo_p) { this.codigo_p = codigo_p; }

    public String getRazon_consulta() { return razon_consulta; }
    public void setRazon_consulta(String razon_consulta) { this.razon_consulta = razon_consulta; }

    public int getN_atenciones() { return n_atenciones; }
    public void setN_atenciones(int n_atenciones) {
        if (n_atenciones < 0) throw new IllegalArgumentException("Las Atenciones deben ser Positivas");
        this.n_atenciones = n_atenciones;
    }

    public LocalDate getFecha_atencion() { return fecha_atencion; }
    public void setFecha_atencion(LocalDate fecha_atencion) { this.fecha_atencion = fecha_atencion; }

    public CHistorialClinico getHistorial() { return historial; }
    public void setHistorial(CHistorialClinico historial) { this.historial = historial; }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = (fecha_atencion != null) ? fecha_atencion.format(formatter) : "No registrada";

        return "Datos del Paciente" +
               "\nDNI: " + getDNI() +
               "\nCódigo: " + codigo_p +
               "\nNombre: " + getNombre() +
               "\nEdad: " + getEdad() +
               "\nRazón de Consulta: " + razon_consulta +
               "\nN° Atenciones: " + n_atenciones +
               "\nFecha de Atención: " + fechaFormateada;
    }
}
  