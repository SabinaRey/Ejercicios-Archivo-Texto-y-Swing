
package Modelo;

public class Ventas {
    private String fecha;
    private String producto;
    private int cantidad;
    private double total;
    
    public Ventas(String fecha, String producto, int cantidad, double total){
        this.fecha = fecha;
        this.producto = producto;
        this.cantidad = cantidad;
        this.total = total;
    }
    
    public Ventas() {
    this("", "", 0, 0.0); 
    }
    public String getFecha() {
        return fecha;
    }
    public String getProducto() {
        return producto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public double getTotal() {
        return total;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    
    @Override
    public String toString(){
        return this.getFecha() + "," +
                this.getProducto() + "," +
                this.getCantidad() + "," +
                this.getTotal();
    }
}
