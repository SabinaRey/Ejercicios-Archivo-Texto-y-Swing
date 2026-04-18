
package Modelo;
public class Pedido {
    private String cliente;
    private String producto;
    private int cantidad;

    public Pedido(String cliente, String producto, int cantidad) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Pedido() {
        this("", "", 0);
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCliente() {
        return cliente;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }
  @Override
    public String toString() {
        return this.getCliente() + "," +
               this.getProducto() + "," +
               this.getCantidad();
    }
}
