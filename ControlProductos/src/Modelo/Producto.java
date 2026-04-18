package Modelo;
public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    
    public Producto (String id, String nombre, 
            double precio, int cantidad){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    public Producto() {
        this("", "", 0.0, 0);
    }

    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString(){
        return this.getId() + "," +
                this.getNombre() + "," +
                this.getPrecio() + "," +
                this.getCantidad();
    }
}
