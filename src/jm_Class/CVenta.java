/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm_Class;

/**
 *
 * @author LIDIA
 */
public class CVenta extends CTransaccion {
    private CPaciente paciente; // ASOCIACIÓN
    private CProducto producto; // AGREGACIÓN
    private int cantidad;
    private static final double IGV = 0.18;

    public CVenta() {
        super();
        this.paciente = null;
        this.producto = null;
        this.cantidad = 0;
    }

    public CVenta(CPaciente paciente, CProducto producto, int cantidad, String fechaRegistro) {
        super(fechaRegistro);
        this.paciente = paciente;
        setProducto(producto);
        setCantidad(cantidad);
        this.montoTotal = calcularTotal();
    }

    public CPaciente getPaciente() { return paciente; }
    public void setPaciente(CPaciente paciente) { this.paciente = paciente; }

    public CProducto getProducto() { return producto; }
    public void setProducto(CProducto producto) {
        if (producto != null) this.producto = producto;
        else System.out.println("Error: El producto no puede ser nulo.");
    }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) {
        if (cantidad > 0) this.cantidad = cantidad;
        else {
            System.out.println("Error: La cantidad debe ser mayor a 0. Se asignará 1 por defecto.");
            this.cantidad = 1;
        }
    }

    public double calcularSubtotal() {
        if (producto != null) return producto.getPrecio() * cantidad;
        return 0.0;
    }

    public double calcularIgv() { return calcularSubtotal() * IGV; }

    @Override
    public double calcularTotal() { return calcularSubtotal() + calcularIgv(); }

    @Override
    public void mostrarResumen() {
        System.out.println("VENTA");
        System.out.println("Cliente: " + (paciente != null ? paciente.getNombre() : "Sin asignar"));
        System.out.println("Fecha: " + fechaRegistro);
        System.out.println("Estado: " + estado);
        if (producto != null) {
            System.out.println("Producto: " + producto.getNombre() + " (" + producto.getCategoria() + ")");
            System.out.println("Precio Unitario: S/." + producto.getPrecio());
        } else {
            System.out.println("Producto: No asignado");
        }
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: S/." + calcularSubtotal());
        System.out.println("IGV (18%): S/." + calcularIgv());
        System.out.println("TOTAL A PAGAR: S/." + calcularTotal());
    }

    @Override
    public String toString() {
        return "Venta [Cliente: " + (paciente != null ? paciente.getNombre() : "Ninguno") +
               " | Producto: " + (producto != null ? producto.getNombre() : "Ninguno") +
               " | Cantidad: " + cantidad +
               " | Total: S/." + calcularTotal() + "]";
    }
}