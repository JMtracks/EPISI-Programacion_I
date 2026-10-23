/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm_Class;

/**
 *
 * @author LIDIA
 */
public class CInsumoFisioterapia {
 
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;
    private String tipoInsumo;  
    
    public CInsumoFisioterapia() {
        this.codigo = "";
        this.nombre = "";
        this.precio = 0.0;
        this.stock = 0;
        this.tipoInsumo = "";
    }
 
    public CInsumoFisioterapia(String codigo, String nombre, double precio, int stock, String tipoInsumo) {
        setCodigo(codigo);
        setNombre(nombre);
        setPrecio(precio);
        setStock(stock);
        setTipoInsumo(tipoInsumo);
    }

    public CInsumoFisioterapia(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = 100;
        this.tipoInsumo = "General";
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.trim().isEmpty()) {
            this.codigo = codigo;
        } else {
            System.out.println("Error: El código no puede estar vacío.");
            this.codigo = "SIN-CODIGO";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacío.");
            this.nombre = "SIN-NOMBRE";
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("Error: El precio no puede ser negativo.");
            this.precio = 0.0;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Error: El stock no puede ser negativo.");
            this.stock = 0;
        }
    }

    public String getTipoInsumo() {
        return tipoInsumo;
    }

    public void setTipoInsumo(String tipoInsumo) {
        if (tipoInsumo != null && !tipoInsumo.trim().isEmpty()) {
            this.tipoInsumo = tipoInsumo;
        } else {
            System.out.println("Error: El tipo de insumo no puede estar vacío.");
            this.tipoInsumo = "General";
        }
    }
 
    @Override
    public String toString() {
        return "Insumo [Código: " + codigo + " | Nombre: " + nombre + 
               " | Tipo: " + tipoInsumo + " | Precio: S/." + precio + 
               " | Stock: " + stock + "]";
    }
}
