
package Modelo;

public class ModeloRegistro {
    ArchivoTexto objArch;
    
    public void registroAsistencia(String nombre, 
            String fecha, 
            String estado){
        
        Asistencia objAsist = new Asistencia();
        objAsist.setNombre(nombre);
        objAsist.setFecha(fecha);
        objAsist.setEstado(estado);
        
        this.objArch = new ArchivoTexto();
        this.objArch.abrirArchivoTexto('w', "asistencia.txt");
        this.objArch.crearLinea(objAsist.toString());
        this.objArch.cerrarArchivo('w');
    }
}
