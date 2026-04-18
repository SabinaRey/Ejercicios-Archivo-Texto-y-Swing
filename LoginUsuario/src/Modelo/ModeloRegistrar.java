
package Modelo;

public class ModeloRegistrar {
    ArchivoTexto objArchivo;

    public void registrarUsuario(String usuario, String contrasena) {

        Usuario objUser = new Usuario();
        objUser.setUsuario(usuario);
        objUser.setContrasena(contrasena);

        objArchivo = new ArchivoTexto();
        objArchivo.abrirArchivoTexto('w', "usuarios.txt");
        objArchivo.crearLinea(objUser.toString());
        objArchivo.cerrarArchivo('w');
    }
}
