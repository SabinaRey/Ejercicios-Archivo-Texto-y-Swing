
package Modelo;

public class ModeloLogin {  
    ArchivoTexto objArchivoTexto;

    public boolean validarUsuario(String usuario, String contrasena) {
        if(usuario == null) usuario="";
        if(contrasena == null) contrasena="";

        objArchivoTexto = new ArchivoTexto();
        objArchivoTexto.abrirArchivoTexto('r', "usuarios.txt");

        Object[][] datos = objArchivoTexto.obtenerMatrizLineas(2);
        objArchivoTexto.cerrarArchivo('r');

        for(int i = 0; i < datos.length; i++){
            //se realiza una proteccion de datos del archivo
            
            String userArchivo = datos[i][0] != null? datos[i][0].toString().trim():"";
            String passArchivo = datos[i][1] != null? datos[i][1].toString().trim():"";
            if(userArchivo.equals(usuario.trim()) &&
               passArchivo.equals(contrasena.trim())){
                return true;
            }
        }

        return false;
    }
}
