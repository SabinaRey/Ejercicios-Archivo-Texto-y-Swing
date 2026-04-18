
package Controlador;

import Modelo.ModeloRegistrarCalificaciones;
public class ControladorRegistrarCalificaciones {
    private String nombre;
    private String materia;
    private double calificacion;    
    ModeloRegistrarCalificaciones objModeloRegistrarCalifi;   
    public ControladorRegistrarCalificaciones(){
        this.objModeloRegistrarCalifi = new ModeloRegistrarCalificaciones();
    }   
    public void registrarCalificaciones (String nombre,
            String materia,
            double calificacion){       
        this.objModeloRegistrarCalifi.registrarCalificaciones(nombre, materia, calificacion);
    }
}
