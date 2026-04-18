
package Modelo;

public class ModeloActividadDiaria {
    ArchivoTexto objArch;
    
    public void actividadDiaria(String fecha,
            String actividad,
            String descripcion){
        
        Actividad objActiv = new Actividad();
        objActiv.setFecha(fecha);
        objActiv.setActividad(actividad);
        objActiv.setDescripcion(descripcion);
        
        this.objArch = new ArchivoTexto();
        this.objArch.abrirArchivoTexto('w', "bitácora.txt");
        this.objArch.crearLinea(objActiv.toString());
        this.objArch.cerrarArchivo('w');
    }
}
