
package edu.jdc.view;

import java.util.Scanner;

public class View {
 private Scanner scanner;
    
    public View() {
        scanner = new Scanner(System.in);
    }
    
    public String obtenerTextoUsuario() {
        System.out.println("Ingresa el texto que quieres cifrar/descifrar: ");
        return scanner.nextLine();
    }
    
    public void mostrarTextoCifrado(String texto) {
        System.out.println("Texto cifrado: " + texto);
    }
    
    public void mostrarTextoDescifrado(String texto) {
        System.out.println("Texto descifrado: " + texto);
    }
}
