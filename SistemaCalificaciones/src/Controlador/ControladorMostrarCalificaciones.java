
package Controlador;
import Modelo.ArchivoTexto;
import Modelo.ModeloMostrarCalificaciones;
import Vista.FrmMostrarCalificaciones;
import javax.swing.table.DefaultTableModel;
public class ControladorMostrarCalificaciones {
    ModeloMostrarCalificaciones objModeloMostrarCalificaciones;
    ArchivoTexto objArchivoTexto;
    FrmMostrarCalificaciones objMostrarCalifi;    
    public ControladorMostrarCalificaciones(FrmMostrarCalificaciones objMostrarCalifi){
        this.objMostrarCalifi = objMostrarCalifi;
        this.objModeloMostrarCalificaciones = new ModeloMostrarCalificaciones();
    } 
    public void mostrarCalf(String[] columnas){
        Object[][] datos;
        datos = this.objModeloMostrarCalificaciones.mostrarCalificaciones(columnas);
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        this.objMostrarCalifi.tblBoletas.setModel(modelo);
    }
}
