
package Modelo;

public class ModeloCatalogoLibro {
    ArchivoTexto objArchivoTexto;
    
    public Object[][] catalogoLibro(String[] columnas){
        this.objArchivoTexto = new ArchivoTexto();
        this.objArchivoTexto.abrirArchivoTexto('r', "libros.txt");
        Object[][] datos = this.objArchivoTexto.obtenerMatrizLineas(columnas.length);
        this.objArchivoTexto.cerrarArchivo('r');
        return datos;
    }
}
