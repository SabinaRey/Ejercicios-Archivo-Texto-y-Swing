
package modelo;

public class ModeloRegistrarEstudiante {
    ArchivoTexto objArch;
    public void registrarEstudiante(String numControl,
            String nombre,
            String carrera,
            double promedio){
        Estudiante objEst = new Estudiante();
        objEst.setNumControl(numControl);
        objEst.setNombre(nombre);
        objEst.setCarrera(carrera);
        objEst.setPromedio(promedio);
        
        this.objArch = new ArchivoTexto();
        this.objArch.abrirArchivo('w', "estudiantes.txt");
        this.objArch.crearLinea(objEst.toString());
        this.objArch.cerrarArchivo('w');
    }
    
}
