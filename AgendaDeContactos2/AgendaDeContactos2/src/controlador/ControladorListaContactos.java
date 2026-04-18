
package controlador;
import javax.swing.table.DefaultTableModel;
import modelo.ArchivoTexto;
import modelo.ModeloListarContactos;
import vista.VistaListarContactos;

public class ControladorListaContactos {
    ModeloListarContactos objModeloListarContactos;
    ArchivoTexto objArchivoTexto;
    VistaListarContactos objListarContactos;
    
    public ControladorListaContactos(VistaListarContactos objListarContactos){
        this.objListarContactos = objListarContactos;
        this.objModeloListarContactos = new ModeloListarContactos();
    }
 
    public void listarCont(String[] columnas){
        Object[][] datos;
        datos = this.objModeloListarContactos.listarContacto(columnas);
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        this.objListarContactos.tblContacto.setModel(modelo);
    } 
}
