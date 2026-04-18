
package Modelo;

public class ModeloListarVentas {
    ArchivoTexto objArchivoTexto;
    
    public Object[][] listarVentas(String[] columnas){
        this.objArchivoTexto = new ArchivoTexto();
        this.objArchivoTexto.abrirArchivoTexto('r', "ventas.txt");
        Object[][] datos = this.objArchivoTexto.obtenerMatrizLineas(columnas.length);
        this.objArchivoTexto.cerrarArchivo('r');
        return datos;
    }
}
