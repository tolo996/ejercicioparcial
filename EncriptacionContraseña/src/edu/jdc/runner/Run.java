package edu.jdc.runner;

import edu.jdc.control.Control;
import edu.jdc.model.Model;
import edu.jdc.view.View;
import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de contrasenias que desea encriptar/desencriptar: ");
        int cantidadContraseñas = scanner.nextInt();
        scanner.nextLine(); 
        
        Model cifrador = new Model("clave"); 
        
        for (int i = 0; i < cantidadContraseñas; i++) {
            System.out.print("Ingrese la contrasenia a encriptar: ");
            String contraseña = scanner.nextLine();
            
            String contraseñaEncriptada = cifrador.cifrarTexto(contraseña);
            System.out.println("Contrasenia encriptada: " + contraseñaEncriptada);
            
            String contraseñaDesencriptada = cifrador.descifrarTexto(contraseñaEncriptada);
            System.out.println("Contrasenia desencriptada: " + contraseñaDesencriptada);
        }
        
        scanner.close();
    }
}
