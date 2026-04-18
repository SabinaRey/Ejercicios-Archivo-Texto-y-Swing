
package Modelo;

public class ModeloRegistrarLibro {
    ArchivoTexto objArch;
    
    public void registrarLibro(String isbn,
            String titulo,
            String autor){
        Libro objLib = new Libro();
        objLib.setIsbn(isbn);
        objLib.setTitulo(titulo);
        objLib.setAutor(autor);
        
        this.objArch = new ArchivoTexto();
        this.objArch.abrirArchivoTexto('a', "libros.txt");
        this.objArch.crearLinea(objLib.toString());
        this.objArch.cerrarArchivo('a');
    }
    
}
