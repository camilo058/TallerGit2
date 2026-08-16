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

        if(Productos.size() > 3){
            double descuento = total * 0.15;
            total = total - descuento;
        }

        return total;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    
}