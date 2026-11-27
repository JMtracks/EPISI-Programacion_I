package jm_Class;

/**
 *
 * @author LIDIA
 */
public class CProductoOrtopedico extends CProducto {
    private String talla;
    private String material;
    private String zonaCorporal;

    public CProductoOrtopedico() {
        super();
    }

    public CProductoOrtopedico(String codigo, String nombre, double precio, int stock,
                                String talla, String material, String zonaCorporal) {
        super(codigo, nombre, precio, stock, "Ortopédico");
        this.talla = talla;
        this.material = material;
        this.zonaCorporal = zonaCorporal;
    }

    public String getTalla() { return talla; }
    public void setTalla(String talla) { this.talla = talla; }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    public String getZonaCorporal() { return zonaCorporal; }
    public void setZonaCorporal(String zonaCorporal) { this.zonaCorporal = zonaCorporal; }

    public String mostrarFichaTecnica() {
        return "Ficha Técnica: " + getNombre() + " | Talla: " + talla +
               " | Material: " + material + " | Zona: " + zonaCorporal;
    }

    @Override
    public String toString() {
        return super.toString() + " | Talla: " + talla + " | Material: " + material;
    }
}
