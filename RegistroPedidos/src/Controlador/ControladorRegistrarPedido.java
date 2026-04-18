
package Controlador;

import Modelo.ModeloRegistrarPedido;

public class ControladorRegistrarPedido {
    ModeloRegistrarPedido objModelo;

    public ControladorRegistrarPedido() {
        objModelo = new ModeloRegistrarPedido();
    }

    public void registrar(String cliente, String producto, int cantidad) {
        objModelo.registrarPedido(cliente, producto, cantidad);
    }
}
