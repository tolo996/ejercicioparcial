
package edu.jdc.model;

import java.util.Stack;


public class Model {
  private Stack<Character> pilaCifrado;
    private String claveCifrado;
    
    
    public Model(String clave) {
        this.claveCifrado = clave;
        this.pilaCifrado = new Stack<Character>();
        
        for (int i = 0; i < clave.length(); i++) {
            pilaCifrado.push(clave.charAt(i));
        }
    }
    
    public String cifrarTexto(String texto) {
        StringBuilder textoCifrado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            if (!Character.isWhitespace(caracter)) {
                char clave = pilaCifrado.pop();
                char caracterCifrado = (char) (caracter + clave);
                textoCifrado.append(caracterCifrado);
                pilaCifrado.push(clave);
            } else {
                textoCifrado.append(caracter);
            }
        }
        return textoCifrado.toString();
    }
    
    public String descifrarTexto(String textoCifrado) {
        StringBuilder textoDescifrado = new StringBuilder();
        for (int i = 0; i < textoCifrado.length(); i++) {
            char caracterCifrado = textoCifrado.charAt(i);
            if (!Character.isWhitespace(caracterCifrado)) {
                char clave = pilaCifrado.pop();
                char caracterDescifrado = (char) (caracterCifrado - clave);
                textoDescifrado.append(caracterDescifrado);
                pilaCifrado.push(clave);
            } else {
                textoDescifrado.append(caracterCifrado);
            }
        }
        return textoDescifrado.toString();
    }
}

