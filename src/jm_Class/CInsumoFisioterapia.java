
package jm_Class;

/**
 *
 * @author LIDIA
 */
public class CInsumoFisioterapia extends CProducto {
    private String tipoInsumo;

    public CInsumoFisioterapia() {
        super();
    }

    public CInsumoFisioterapia(String codigo, String nombre, double precio, int stock, String tipoInsumo) {
        super(codigo, nombre, precio, stock, "Insumo de Fisioterapia");
        setTipoInsumo(tipoInsumo);
    }

    public CInsumoFisioterapia(String codigo, String nombre, double precio) {
        super(codigo, nombre, precio, 100, "Insumo de Fisioterapia");
        this.tipoInsumo = "General";
    }

    public String getTipoInsumo() { return tipoInsumo; }

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
        return "Insumo [Código: " + getCodigo() + " | Nombre: " + getNombre() +
               " | Tipo: " + tipoInsumo + " | Precio: S/." + getPrecio() +
               " | Stock: " + getStock() + "]";
    }
}