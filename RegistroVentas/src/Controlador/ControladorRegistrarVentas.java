
package Controlador;
import Modelo.ModeloRegistrarVenta;

public class ControladorRegistrarVentas {
    private String fecha;
    private String producto;
    private int cantidad;
    private double total;
    
    ModeloRegistrarVenta objModeloRegistrarVent;
    
    public ControladorRegistrarVentas(){
        this.objModeloRegistrarVent = new ModeloRegistrarVenta();
    }
    
    public void registrarVentas(String fecha,
            String producto,
            int cantidad,
            double total){
        
        this.objModeloRegistrarVent.registrarVentas(fecha, producto, cantidad, total);
    }
}
