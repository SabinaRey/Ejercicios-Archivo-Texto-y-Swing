
package Modelo;

public class ModeloRegistrarVenta {
    ArchivoTexto objArch;
    
    public void registrarVentas(String fecha,
            String producto,
            int cantidad,
            double total){
        
        Ventas objVent= new Ventas();
        objVent.setFecha(fecha);
        objVent.setProducto(producto);
        objVent.setCantidad(cantidad);
        objVent.setTotal(total);
        
        this.objArch = new ArchivoTexto();
        this.objArch.abrirArchivoTexto('w', "ventas.txt");
        this.objArch.crearLinea(objVent.toString());
        this.objArch.cerrarArchivo('w');
    } 
}
