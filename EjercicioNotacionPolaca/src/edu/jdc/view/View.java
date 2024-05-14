
package edu.jdc.view;

import java.util.Scanner;


public class View {
    
    private Scanner scanner = new Scanner(System.in);

    public String getUserInput() {
        System.out.println("Digite la expresion en Notacion Polaca Inversa:");
        return scanner.nextLine();
    }

    public void showResult(int result) {
        System.out.println("El resultado de la expresion es: " + result);
    }
}

