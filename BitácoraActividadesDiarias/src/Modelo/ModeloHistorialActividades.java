
package Modelo;

public class ModeloHistorialActividades {
    ArchivoTexto objArchivoTexto;
    
    public Object[][] actividadDiaria(String[] columnas){
        this.objArchivoTexto = new ArchivoTexto();
        this.objArchivoTexto.abrirArchivoTexto('r', "bitácora.txt");
        Object[][] datos = this.objArchivoTexto.obtenerMatrizLineas(columnas.length);
        this.objArchivoTexto.cerrarArchivo('r');
        return datos;
    }
}
