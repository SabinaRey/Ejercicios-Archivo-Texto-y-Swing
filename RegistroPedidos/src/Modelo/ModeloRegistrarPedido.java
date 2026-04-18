
package Modelo;

public class ModeloRegistrarPedido {
    ArchivoTexto objArchivo;

    public void registrarPedido(String cliente, String producto, int cantidad) {

        Pedido objPedido = new Pedido();
        objPedido.setCliente(cliente);
        objPedido.setProducto(producto);
        objPedido.setCantidad(cantidad);

        objArchivo = new ArchivoTexto();
        objArchivo.abrirArchivoTexto('w', "pedidos.txt");
        objArchivo.crearLinea(objPedido.toString());
        objArchivo.cerrarArchivo('w');
    }
}

