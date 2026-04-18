
package controlador;
import modelo.ModeloRegistrarEstudiante;
public class ControladorRegistrarEstudiante {
    private String numControl;
    private String nombre;
    private String carrera;
    private double promedio;
    
    ModeloRegistrarEstudiante objModeloRegistarEst;   
    public ControladorRegistrarEstudiante(){
        this.objModeloRegistarEst = new ModeloRegistrarEstudiante();       
    }   
    public void registrarEstudiante(String numControl,
            String nombre,
            String carrera,
            double promedio){
        this.objModeloRegistarEst.registrarEstudiante(numControl, nombre, carrera, promedio);
    }  
}
