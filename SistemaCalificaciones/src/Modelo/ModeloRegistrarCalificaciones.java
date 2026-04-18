
package Modelo;
public class ModeloRegistrarCalificaciones {
    ArchivoTexto objArch;
    public void registrarCalificaciones(String nombre,
            String materia,
            double calificaion){
        
        Calificacion objCalf = new Calificacion();
        objCalf.setNombre(nombre);
        objCalf.setMateria(materia);
        objCalf.setCalificacion(calificaion);
        
        this.objArch = new ArchivoTexto();
        this.objArch.abrirArchivoTexto('w', "calificaciones.txt");
        this.objArch.crearLinea(objCalf.toString());
        this.objArch.cerrarArchivo('w');
    }   
}
