
package Controlador;

import Modelo.ModeloRegistrar;

public class ControladorRegistrar {
    private String usuario;
    private String contrasena;
      ModeloRegistrar objModeloRegistrar;

    public ControladorRegistrar() {
        objModeloRegistrar = new ModeloRegistrar();
    }
    public void registrar(String usuario, String contrasena) {
        objModeloRegistrar.registrarUsuario(usuario, contrasena);
    }
}
