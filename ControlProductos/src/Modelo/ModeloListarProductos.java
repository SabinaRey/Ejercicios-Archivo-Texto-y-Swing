
package Modelo;

public class ModeloListarProductos {
    ArchivoTexto objArchivoTexto;
    
    public Object[][] listarProductos(String[] columnas){
        this.objArchivoTexto = new ArchivoTexto();
        this.objArchivoTexto.abrirArchivoTexto('r', "productos.txt");
        Object[][] datos = this.objArchivoTexto.obtenerMatrizLineas(columnas.length);
        this.objArchivoTexto.cerrarArchivo('r');
        return datos;
    }
}
