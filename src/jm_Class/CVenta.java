/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm_Class;

/**
 *
 * @author LIDIA
 */
public class CVenta {
 
    private String dniCliente;
    private CInsumoFisioterapia producto; 
    private int cantidad;
    
    private static final double IGV = 0.18;
    
    public CVenta() {
        this.dniCliente = "";
        this.producto = null;
        this.cantidad = 0;
    }

    public CVenta(String dniCliente, CInsumoFisioterapia producto, int cantidad) {
        setDniCliente(dniCliente);
        setProducto(producto);
        setCantidad(cantidad);
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        if (dniCliente != null && dniCliente.length() == 8) {
            this.dniCliente = dniCliente;
        } else {
            System.out.println("Error: El DNI debe tener 8 dígitos. Se asignará '00000000'.");
            this.dniCliente = "00000000";
        }
    }

    public CInsumoFisioterapia getProducto() {
        return producto;
    }

    public void setProducto(CInsumoFisioterapia producto) {
        if (producto != null) {
            this.producto = producto;
        } else {
            System.out.println("Error: El producto no puede ser nulo.");
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            System.out.println("Error: La cantidad debe ser mayor a 0. Se asignará 1 por defecto.");
            this.cantidad = 1;
        }
    }

    public double calcularSubtotal() {
        if (producto != null) {
            return producto.getPrecio() * cantidad;
        }
        return 0.0;
    }

    public double calcularIgv() {
        return calcularSubtotal() * IGV;
    }

    public double calcularTotal() {
        return calcularSubtotal() + calcularIgv();
    }

    public void mostrarResumenVenta() {
        System.out.println("VENTA");
        System.out.println("DNI Cliente: " + dniCliente);
        if (producto != null) {
            System.out.println("Producto: " + producto.getNombre() + " (" + producto.getTipoInsumo() + ")");
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
        return "Venta [DNI: " + dniCliente + 
               " | Producto: " + (producto != null ? producto.getNombre() : "Ninguno") + 
               " | Cantidad: " + cantidad + 
               " | Total: S/." + calcularTotal() + "]";
    }
}
