
package Controlador;
import Modelo.ArchivoTexto;
import Modelo.ModeloHistorialActividades;
import Vista.FrmHistorialActividades;
import javax.swing.table.DefaultTableModel;

public class ControladorHistorialActividades {
    ModeloHistorialActividades objModeloHistorialActividades;
    ArchivoTexto objArchivoTexto;
    FrmHistorialActividades objHistorialActividades;
    
    public ControladorHistorialActividades(FrmHistorialActividades objListarProductos){
        this.objHistorialActividades = objListarProductos;
        this.objModeloHistorialActividades = new ModeloHistorialActividades();
    }
    public void actividadDia( String[] columnas){
        Object[][] datos;
        datos = this.objModeloHistorialActividades.actividadDiaria(columnas);
        DefaultTableModel modelo = new DefaultTableModel (datos, columnas);
        this.objHistorialActividades.tblHistorial.setModel(modelo);
    }
}
 