
package Controlador;
import Modelo.ModeloRegistrarProducto;

public class ControladorRegistrarProducto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad; 
    ModeloRegistrarProducto objModeloRegistrarProd;
    
    public ControladorRegistrarProducto(){
        this.objModeloRegistrarProd = new ModeloRegistrarProducto();
    }
    public void registrarProducto(String id,
            String nombre,
            double precio,
            int cantidad){
        
        this.objModeloRegistrarProd.registrarProductos(id, nombre, precio, cantidad);
    } 
}
