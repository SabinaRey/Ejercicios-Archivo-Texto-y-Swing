
package Controlador;

import Modelo.ModeloLogin;

public class ControladorLogin {
    /*private String usuario;
    private String contrasena;*/
    ModeloLogin objModeloLogin;

    public ControladorLogin() {
        objModeloLogin = new ModeloLogin();
    }

    public boolean login(String usuario, String contrasena) {
        return objModeloLogin.validarUsuario(usuario, contrasena);
    }
}
