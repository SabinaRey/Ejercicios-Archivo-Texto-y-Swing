
package controlador;
import javax.swing.table.DefaultTableModel;
import modelo.ArchivoTexto;
import modelo.ModeloListarEstudiante;
import vista.VistaListarEstudiantes;

public class ControladorListaEstudiantes {
    ModeloListarEstudiante objModeloListarEstudiante;
    ArchivoTexto objArchivoTexto;
    VistaListarEstudiantes objListarEstudiantes; 
public ControladorListaEstudiantes(VistaListarEstudiantes objListarEstudiantes){
    this.objListarEstudiantes = objListarEstudiantes;
    this.objModeloListarEstudiante = new ModeloListarEstudiante();
  }
public void listarEst(String[] columnas){
    Object [][] datos;
    datos = this.objModeloListarEstudiante.listarEstudiantes(columnas);
    DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
    this.objListarEstudiantes.tblEstudiante.setModel(modelo);
    
  }
}

    


