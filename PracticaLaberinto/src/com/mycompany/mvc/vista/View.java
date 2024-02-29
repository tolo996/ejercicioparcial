
package com.mycompany.mvc.vista;

import java.util.Scanner;

public class View {
    private Scanner scanner;

    public View() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public int obtenerRespuesta() {
        return scanner.nextInt();
    }
}
