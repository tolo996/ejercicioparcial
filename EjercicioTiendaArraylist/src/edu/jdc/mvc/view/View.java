/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.mvc.view;

import edu.jdc.mvc.model.Producto;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class View {
     public void mostrarMenu() {
        System.out.println("Bienvenido a la tienda");
        System.out.println("1. Registrar producto");
        System.out.println("2. Mostrar productos");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public void mostrarProductos(ArrayList<Producto> productos) {
        System.out.println("\nProductos en la tienda:");
        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio());
        }
    }
}
