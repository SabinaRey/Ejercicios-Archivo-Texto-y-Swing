
package Controlador;

import Modelo.ArchivoTexto;
import Modelo.ModeloListarPedidos;
import Vista.FrmMostrarPedidos;
import javax.swing.table.DefaultTableModel;

public class ControladorListarPedido {
    ModeloListarPedidos objModeloPedido;
    ArchivoTexto objArchivoTexto;
    FrmMostrarPedidos objAgregarPed;

    public ControladorListarPedido(FrmMostrarPedidos objAgregarPed) {
        this.objAgregarPed = objAgregarPed;
        this.objModeloPedido = new ModeloListarPedidos();
    }

    public void listar(String[] columnas) {

        Object[][] datos;
        datos = this.objModeloPedido.listarPedidos(columnas);
        DefaultTableModel modelo = new DefaultTableModel (datos, columnas);
        this.objAgregarPed.tblPedidos.setModel (modelo);
    }
}
