
package Controlador;

import Modelo.ModeloRegistro;

public class ControladorRegistro {
    private String nombre;
    private String fecha;
    private String estado;
    ModeloRegistro objModeloRegistro;
    
    public ControladorRegistro(){
        this.objModeloRegistro = new ModeloRegistro();       
    }
    public void registroAsistencia(String nombre,
            String fecha,
            String estado){
        this.objModeloRegistro.registroAsistencia(nombre, fecha, estado);
    }
}
