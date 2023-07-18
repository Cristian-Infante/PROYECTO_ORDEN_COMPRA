import javax.xml.crypto.Data;
import java.util.Date;

public class OrdenCompra {
    private int identificador;
    private static int contadorOrdenes;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;

    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
        this.identificador = ++OrdenCompra.contadorOrdenes;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getIdentificador() {
        return identificador;
    }
    public static int getContadorOrdenes() {
        return contadorOrdenes;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public Date getFecha() {
        return fecha;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public Producto[] getProductos() {
        return productos;
    }

    public void addProducto (Producto producto) {
        if (this.productos == null) {
            this.productos = new Producto[1];
            this.productos[0] = producto;
        } else {
            Producto[] productos = new Producto[this.productos.length + 1];
            for (int i = 0; i < this.productos.length; i++) {
                productos[i] = this.productos[i];
            }
            productos[this.productos.length] = producto;
            this.productos = productos;
        }
    }

    public int getTotal() {
        int total = 0;
        for (Producto producto : this.productos) {
            total += producto.getPrecio();
        }
        return total;
    }
}
