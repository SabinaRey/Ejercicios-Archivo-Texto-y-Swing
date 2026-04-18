
package Modelo;
public class ModeloMostrarCalificaciones {
        ArchivoTexto objArch;
    public Object[][] mostrarCalificaciones(String[] columnas){
    ArchivoTexto objArch = new ArchivoTexto();
    objArch.abrirArchivoTexto('r', "calificaciones.txt");
    Object[][] datos = objArch.obtenerMatrizLineas(columnas.length);
    objArch.cerrarArchivo('r');
    return datos;
   }   
}
