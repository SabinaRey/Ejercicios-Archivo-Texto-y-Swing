
package Controlador;

import Modelo.ArchivoTexto;
import Modelo.ModeloAsistencia;
import Vista.FrmAsistencia;
import javax.swing.table.DefaultTableModel;

public class ControladorAsistencia {
    ModeloAsistencia objModeloAsistencia;
    ArchivoTexto objArchivoTexto;
    FrmAsistencia objAsistencia;
    
    public ControladorAsistencia(FrmAsistencia objAsistencia){
      this.objAsistencia = objAsistencia;
      this.objModeloAsistencia = new ModeloAsistencia();
    }
    
    public void asistenciaList( String[] columnas){
        Object [][] datos;
        datos = this.objModeloAsistencia.mostrarAsistencia(columnas);
        DefaultTableModel modelo = new DefaultTableModel (datos, columnas);
        this.objAsistencia.tblLista.setModel(modelo);
    }
}
