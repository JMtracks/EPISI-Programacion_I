
package jm_Class;

/**
 *
 * @author LIDIA
 */
public class CProducto {
    protected String codigo;
    protected String nombre;
    protected double precio;
    protected int stock;
    protected String categoria;

    public CProducto() {}

    public CProducto(String codigo, String nombre, double precio, int stock, String categoria) {
        setCodigo(codigo);
        setNombre(nombre);
        setPrecio(precio);
        setStock(stock);
        setCategoria(categoria);
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.trim().isEmpty()) this.codigo = codigo;
        else throw new IllegalArgumentException("Código inválido");
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) this.nombre = nombre;
        else throw new IllegalArgumentException("Nombre inválido");
    }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) {
        if (precio >= 0) this.precio = precio;
        else throw new IllegalArgumentException("Precio inválido");
    }

    public int getStock() { return stock; }
    public void setStock(int stock) {
        if (stock >= 0) this.stock = stock;
        else throw new IllegalArgumentException("Stock inválido");
    }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) {
        if (categoria != null && !categoria.trim().isEmpty()) this.categoria = categoria;
        else throw new IllegalArgumentException("Categoría inválida");
    }

    @Override
    public String toString() {
        return "Producto [Código: " + codigo + " | Nombre: " + nombre +
               " | Precio: S/." + precio + " | Stock: " + stock +
               " | Categoría: " + categoria + "]";
    }
}