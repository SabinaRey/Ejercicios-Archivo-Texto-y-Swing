
package Controlador;
import Modelo.ModeloActividadDiaria;

public class ControladorActividadDiaria {
    private String fecha;
    private String actividad;
    private String descripcion;
    ModeloActividadDiaria objModeloAcatividadDia;
    
    public ControladorActividadDiaria(){
        this.objModeloAcatividadDia = new ModeloActividadDiaria();
    }
    public void actividadDiaria(String fecha,
            String actividad,
            String descripcion){  
        this.objModeloAcatividadDia.actividadDiaria(fecha, actividad, descripcion);
    } 
}
