import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Producto> productos;

    public Pedido() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }
    public double calcularTotalConDescuento(double porcentaje) ¨{
        double total = calcularTotal();
        double descuento = total*(porcentaje/100);
        return total-descuento;
    }


    public List<Producto> getProductos() {
        return productos;
    }
}