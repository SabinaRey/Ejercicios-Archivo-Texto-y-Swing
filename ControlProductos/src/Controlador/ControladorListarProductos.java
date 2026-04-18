
package Controlador;
import Modelo.ArchivoTexto;
import Modelo.ModeloListarProductos;
import Vista.FrmListarProductos;
import javax.swing.table.DefaultTableModel;

public class ControladorListarProductos {
    ModeloListarProductos objModeloListarProductos;
    ArchivoTexto objArchivoTexto;
    FrmListarProductos objListarProductos;
    
    public ControladorListarProductos(FrmListarProductos objListarProductos){
        this.objListarProductos = objListarProductos;
        this.objModeloListarProductos = new ModeloListarProductos();
    }
    
    public void listarProd( String[] columnas){
        Object[][] datos;
        datos = this.objModeloListarProductos.listarProductos(columnas);
        DefaultTableModel modelo = new DefaultTableModel (datos, columnas);
        this.objListarProductos.tblProductos.setModel(modelo);
    }
}
 