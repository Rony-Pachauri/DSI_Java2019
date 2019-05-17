

package entity;


public class productosTO {

    public productosTO() {
    }

    private String idproducto;
    private String descripcion;
    private int idlinea ;
    private int preciocompra;
    private int precioventa;
    private int stock;
    
    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdlinea() {
        return idlinea;
    }

    public void setIdlinea(int idlinea) {
        this.idlinea = idlinea;
    }

    public int getPreciocompra() {
        return preciocompra;
    }

    public void setPreciocompra(int preciocompra) {
        this.preciocompra = preciocompra;
    }

    public int getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(int precioventa) {
        this.precioventa = precioventa;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    
    
    public productosTO(String idproducto, String descripcion, int idlinea, int preciocompra, int precioventa, int stock) {
        this.idproducto = idproducto;
        this.descripcion = descripcion;
        this.idlinea = idlinea;
        this.preciocompra = preciocompra;
        this.precioventa = precioventa;
        this.stock = stock;
    }
    
}
