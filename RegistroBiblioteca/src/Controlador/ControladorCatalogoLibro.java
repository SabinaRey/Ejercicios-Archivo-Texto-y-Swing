
package Controlador;

import Modelo.ArchivoTexto;
import Modelo.ModeloCatalogoLibro;
import Vista.FrmCatalogoLibro;
import javax.swing.table.DefaultTableModel;

public class ControladorCatalogoLibro {
    ModeloCatalogoLibro objModeloCatalogoLib;
    ArchivoTexto objArchivoTexto;
    FrmCatalogoLibro objCatalogoLibro;
    
    public ControladorCatalogoLibro(FrmCatalogoLibro objCatalogoLibro){
       this.objCatalogoLibro = objCatalogoLibro;
       this.objModeloCatalogoLib = new ModeloCatalogoLibro();
    }
    public void catalogoLibro(String[] columnas){
        Object[][] datos;
        datos = this.objModeloCatalogoLib.catalogoLibro(columnas);
        DefaultTableModel modelo = new DefaultTableModel (datos, columnas);
        this.objCatalogoLibro.tblCatalogo.setModel (modelo);
    }
}
