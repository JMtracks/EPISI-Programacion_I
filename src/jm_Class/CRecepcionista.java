/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm_Class;

/**
 *
 * @author RAMOS VILCHEZ VICTOR MIGUEL
 */
public class CRecepcionista {
    
    private String codigo_recepcionista;
    private String nombre;
    private int citas_creadas;
    private int ventas_realizadas;
    private int reportes_generados;

    // Constructor con parámetros para inicializar al recepcionista
    public CRecepcionista(String codigo_recepcionista, String nombre, int citas_creadas, int ventas_realizadas, int reportes_generados) {
        this.codigo_recepcionista = codigo_recepcionista;
        this.nombre = nombre;
        this.citas_creadas = citas_creadas;
        this.ventas_realizadas = ventas_realizadas;
        this.reportes_generados = reportes_generados;
    }

    // Constructor vacío
    public CRecepcionista() {
    }

    // --- Getters y Setters ---
    public String getCodigo_recepcionista() { return codigo_recepcionista; }
    public void setCodigo_recepcionista(String codigo_recepcionista) { 
        this.codigo_recepcionista = codigo_recepcionista; 
    }
    public String getNombre() { return nombre; }
    
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }
    
    public int getCitas_creadas() { return citas_creadas; }
    
    public void setCitas_creadas(int citas_creadas) { 
        this.citas_creadas = citas_creadas; 
    }
    
    public int getVentas_realizadas() { return ventas_realizadas; }
    
    public void setVentas_realizadas(int ventas_realizadas) { 
        this.ventas_realizadas = ventas_realizadas; 
    }
    
    public int getReportes_generados() { return reportes_generados; }
    public void setReportes_generados(int reportes_generados) { 
        this.reportes_generados = reportes_generados; 
    }

    @Override
    public String toString() {
        return "Datos del Recepcionista: " + codigo_recepcionista + 
                "Nombre: " + nombre + 
               "Citas Creadas: " + citas_creadas + 
               "Ventas Realizadas: " + ventas_realizadas + 
               "Reportes Generados: " + reportes_generados;
    }
}