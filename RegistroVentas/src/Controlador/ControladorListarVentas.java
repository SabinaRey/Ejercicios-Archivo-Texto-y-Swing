
package Controlador;

import Modelo.ArchivoTexto;
import Modelo.ModeloListarVentas;
import Vista.FrmListarVentas;
import javax.swing.table.DefaultTableModel;

public class ControladorListarVentas {
    ModeloListarVentas objModeloListarVentas;
    ArchivoTexto objArchivoTexto;
    FrmListarVentas objListarVentas;
    
    public ControladorListarVentas(FrmListarVentas objListarProductos){
        this.objListarVentas = objListarProductos;
        this.objModeloListarVentas = new ModeloListarVentas();
    }
    
    public void listarVent( String[] columnas){
        Object[][] datos;
        datos = this.objModeloListarVentas.listarVentas(columnas);
        DefaultTableModel modelo = new DefaultTableModel (datos, columnas);
        this.objListarVentas.tblHistorial.setModel(modelo);
    }
}
 