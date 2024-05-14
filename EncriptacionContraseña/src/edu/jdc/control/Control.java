
package edu.jdc.control;

import edu.jdc.model.Model;
import edu.jdc.view.View;

public class Control {
    private Model modelo;
    private View vista;
    
    public Control(Model modelo, View vista) {
        this.modelo = modelo;
        this.vista = vista;
    }
    
    public void iniciarCifrado() {
        String texto = vista.obtenerTextoUsuario();
        String textoCifrado = modelo.cifrarTexto(texto);
        vista.mostrarTextoCifrado(textoCifrado);
    }
    
    public void iniciarDescifrado() {
        String textoCifrado = vista.obtenerTextoUsuario();
        String textoDescifrado = modelo.descifrarTexto(textoCifrado);
        vista.mostrarTextoDescifrado(textoDescifrado);
    }
}
