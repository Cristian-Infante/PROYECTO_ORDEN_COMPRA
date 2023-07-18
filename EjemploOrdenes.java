import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {
        OrdenCompra orden1 = new OrdenCompra("Mercado");
        OrdenCompra orden2 = new OrdenCompra("Supermercado");
        OrdenCompra orden3 = new OrdenCompra("Tienda");

        orden1.setFecha(Date.from(new Date().toInstant()));
        orden1.setCliente(new Cliente("Juan", "Perez"));
        orden1.addProducto(new Producto("Alpina", "Leche", 2000));
        orden1.addProducto(new Producto("Nestle", "Nescafe", 1000));
        orden1.addProducto(new Producto("Alpina", "Queso", 4000));
        orden1.addProducto(new Producto("Alpina", "Mantequilla", 1500));

        orden2.setFecha(Date.from(new Date().toInstant()));
        orden2.setCliente(new Cliente("Pedro", "Bermudez"));
        orden2.addProducto(new Producto("Nestle", "Nesquik", 3000));
        orden2.addProducto(new Producto("Alpina", "Yogurt", 1000));
        orden2.addProducto(new Producto("Fab", "Detergente liquido", 10000));
        orden2.addProducto(new Producto("Gourmet", "Aceite", 15000));

        orden3.setFecha(Date.from(new Date().toInstant()));
        orden3.setCliente(new Cliente("Maria", "Gonzalez"));
        orden3.addProducto(new Producto("Bimbo", "Pan tajado", 6000));
        orden3.addProducto(new Producto("Alpina", "Leche", 2000));
        orden3.addProducto(new Producto("Rica", "Mortadela", 8000));
        orden3.addProducto(new Producto("Alpina", "Queso", 4000));

        System.out.println();
        for (OrdenCompra OC : new OrdenCompra[] { orden1, orden2, orden3 }) {
            System.out.println("Orden " + OC.getIdentificador() + ": " + OC.getDescripcion());
            System.out.println("Cliente: " + OC.getCliente().getNombre() + " " + OC.getCliente().getApellido());
            System.out.println("Fecha: " + OC.getFecha());
            System.out.println("Productos:");
            for (Producto producto : OC.getProductos()) {
                System.out.println("\t" + producto.getNombre() + " (" + producto.getFabricante() + "): $"
                        + producto.getPrecio());
            }
            System.out.println("Total: $" + OC.getTotal());
            System.out.println();
        }

    }
}
