
package modelo;

public class ModeloListarEstudiante {
    ArchivoTexto objArchivoTexto;
    
    public Object [][] listarEstudiantes(String [] columnas){
        this.objArchivoTexto = new ArchivoTexto();
        this.objArchivoTexto.abrirArchivo('r', "estudiantes.txt");
        Object [][] datos = this.objArchivoTexto.obtenerMatrizLineas(columnas.length);
        this.objArchivoTexto.cerrarArchivo('r');
        return datos;
    }
}
