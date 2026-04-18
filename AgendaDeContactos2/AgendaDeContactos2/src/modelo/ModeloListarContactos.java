
package modelo;
public class ModeloListarContactos {
    ArchivoTexto objArchivoTexto;
    
    public Object[][] listarContacto(String[] columnas){
        this.objArchivoTexto = new ArchivoTexto();
        this.objArchivoTexto.abrirArchivoTexto('r',"contactos.txt");
        Object [][] datos = this.objArchivoTexto.obtenerMatrizLineas(columnas.length);
        this.objArchivoTexto.cerrarArchivo('r');
        return datos;
    }  
}
