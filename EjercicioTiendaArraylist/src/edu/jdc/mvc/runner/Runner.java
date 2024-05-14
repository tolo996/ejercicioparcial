/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.mvc.runner;

import edu.jdc.mvc.control.Control;
import edu.jdc.mvc.view.View;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Runner {
    
    public static void main(String[] args) {
        
     Scanner scanner = new Scanner(System.in);
        Control controller = new Control();
        View view = new View();

        int opcion;
        do {
            view.mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el precio del producto: ");
                    double precio = scanner.nextDouble();
                    controller.agregarProducto(nombre, precio);
                    System.out.println("Producto registrado correctamente.");
                    break;
                case 2:
                    view.mostrarProductos(controller.getProductos());
                    break;
                case 3:
                    System.out.println("Gracias por usar la tienda. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 3);
    
}
}