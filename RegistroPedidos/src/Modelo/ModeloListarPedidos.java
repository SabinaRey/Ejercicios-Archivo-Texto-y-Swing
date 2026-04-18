
package Modelo;
public class ModeloListarPedidos {
        ArchivoTexto objArchivo;
    public Object[][] listarPedidos(String[] columnas) {
        objArchivo = new ArchivoTexto();
        objArchivo.abrirArchivoTexto('r', "pedidos.txt");
        Object[][] datos = objArchivo.obtenerMatrizLineas(columnas.length);
        objArchivo.cerrarArchivo('r');
        return datos;
    }
}
