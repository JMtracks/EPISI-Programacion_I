/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm_Class;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 * Clase Paciente 
 * @author RAMOS VILCHEZ VICTOR MIGUEL
 */
public class CPaciente {
    // Atributos
    private static int total_pacientes = 0;
    private String nombre;
    private String codigo_p;
    private String razon_consulta;
    private int n_atenciones;
    private LocalDate fecha_atencion;
    
    public CPaciente(String nombre, String codigo_p, String razon_consulta, int n_atenciones, LocalDate fecha_atencion) {
        this.nombre = nombre;
        this.codigo_p = codigo_p;
        this.razon_consulta = razon_consulta;
        this.n_atenciones = n_atenciones;
        this.fecha_atencion = fecha_atencion;
        total_pacientes++;
    }
    
    // Constructor vacío
    public CPaciente() {
        total_pacientes++;
    }

    // Getters y Setters
    public static int getTotal_pacientes() {
        return total_pacientes;
    }

    public static void setTotal_pacientes(int total_pacientes) {
        CPaciente.total_pacientes = total_pacientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo_p() {
        return codigo_p;
    }

    public void setCodigo_p(String codigo_p) {
        this.codigo_p = codigo_p;
    }

    public String getRazon_consulta() {
        return razon_consulta;
    }

    public void setRazon_consulta(String razon_consulta) {
        this.razon_consulta = razon_consulta;
    }

    public int getN_atenciones() {
        return n_atenciones;
    }

    public void setN_atenciones(int n_atenciones) {
        if(n_atenciones<0) throw new IllegalArgumentException("Las Atenciones deben ser Positivos");
        this.n_atenciones = n_atenciones;
    }

    public LocalDate getFecha_atencion() {
        return fecha_atencion;
    }

    public void setFecha_atencion(LocalDate fecha_atencion) {
        this.fecha_atencion = fecha_atencion;
    }

    // Método toString para visualizar la información del paciente fácilmente
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = (fecha_atencion != null) ? fecha_atencion.format(formatter) : "No registrada";
        
        return "Datos del Paciente" +
               "\nCódigo: " + codigo_p +
               "\nNombre: " + nombre +
               "\nRazón de Consulta: " + razon_consulta +
               "\nN° Atenciones: " + n_atenciones +
               "\nFecha de Atención: " + fechaFormateada;
    }
}
  