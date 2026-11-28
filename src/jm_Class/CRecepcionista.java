/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm_Class;

/**
 *
 * @author RAMOS VILCHEZ VICTOR MIGUEL
 */
import java.util.ArrayList;
import java.util.List;

public class CRecepcionista extends CPersonal {
    private String codigo_recepcionista;
    private int citas_creadas;
    private int ventas_realizadas;
    private int reportes_generados;
    private List<CCita> citas;   // ASOCIACIÓN
    private List<CVenta> ventas; // ASOCIACIÓN

    public CRecepcionista() {
        super();
        this.citas = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }

    public CRecepcionista(String DNI, String nombre, int edad, String usuario, String contrasena,
                           String horario, String codigo_recepcionista,
                           int citas_creadas, int ventas_realizadas, int reportes_generados) {
        super(DNI, nombre, edad, "Recepcionista", usuario, contrasena, horario);
        this.codigo_recepcionista = codigo_recepcionista;
        this.citas_creadas = citas_creadas;
        this.ventas_realizadas = ventas_realizadas;
        this.reportes_generados = reportes_generados;
        this.citas = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }

    public String getCodigo_recepcionista() { return codigo_recepcionista; }
    public void setCodigo_recepcionista(String codigo_recepcionista) { this.codigo_recepcionista = codigo_recepcionista; }

    public int getCitas_creadas() { return citas_creadas; }
    public void setCitas_creadas(int citas_creadas) { this.citas_creadas = citas_creadas; }

    public int getVentas_realizadas() { return ventas_realizadas; }
    public void setVentas_realizadas(int ventas_realizadas) { this.ventas_realizadas = ventas_realizadas; }

    public int getReportes_generados() { return reportes_generados; }
    public void setReportes_generados(int reportes_generados) { this.reportes_generados = reportes_generados; }

    public List<CCita> getCitas() { return citas; }
    public void agregarCita(CCita cita) {
        if (cita == null) throw new IllegalArgumentException("Cita no puede ser nula");
        this.citas.add(cita);
    }

    public List<CVenta> getVentas() { return ventas; }
    public void agregarVenta(CVenta venta) {
        if (venta == null) throw new IllegalArgumentException("Venta no puede ser nula");
        this.ventas.add(venta);
    }

    @Override
    public String toString() {
        return "Recepcionista [Código: " + codigo_recepcionista +
               " | Nombre: " + getNombre() +
               " | Citas creadas: " + citas_creadas +
               " | Ventas: " + ventas_realizadas +
               " | Reportes: " + reportes_generados +
               " | Citas asignadas: " + citas.size() +
               " | Ventas asignadas: " + ventas.size() + "]";
    }
}