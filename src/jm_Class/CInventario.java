/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jm_Class;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LIDIA
 */

public class CInventario {
    private String codigoAlmacen;
    private final int stockMinimoAlerta = 5;
    private List<CProducto> productos; // AGREGACIÓN

    public CInventario() {
        this.codigoAlmacen = "";
        this.productos = new ArrayList<>();
    }

    public CInventario(String codigoAlmacen) {
        this.codigoAlmacen = codigoAlmacen;
        this.productos = new ArrayList<>();
    }

    public String getCodigoAlmacen() { return codigoAlmacen; }
    public void setCodigoAlmacen(String codigoAlmacen) { this.codigoAlmacen = codigoAlmacen; }

    public int getStockMinimoAlerta() { return stockMinimoAlerta; }

    public List<CProducto> getProductos() { return productos; }
    public void agregarProducto(CProducto producto) {
        if (producto == null) throw new IllegalArgumentException("Producto no puede ser nulo");
        this.productos.add(producto);
    }

    public boolean verificarAlertaStock(int stockActual) {
        return stockActual <= stockMinimoAlerta;
    }

    @Override
    public String toString() {
        return "Inventario [Almacén: " + codigoAlmacen +
               " | Productos: " + productos.size() +
               " | Stock mínimo alerta: " + stockMinimoAlerta + "]";
    }
}
