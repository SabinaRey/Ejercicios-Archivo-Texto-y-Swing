
package Controlador;

import Modelo.ModeloRegistrarLibro;

public class ControladorRegistrarLibro {
    private String isbn;
    private String titulo;
    private String autor;
    ModeloRegistrarLibro objModeloRegistrarLib;
    
    public ControladorRegistrarLibro(){
        this.objModeloRegistrarLib = new ModeloRegistrarLibro();
    }
    public void registrarLibro(String isbn,
            String titulo,
            String autor){
        this.objModeloRegistrarLib.registrarLibro(isbn, titulo, autor);
    }
}
