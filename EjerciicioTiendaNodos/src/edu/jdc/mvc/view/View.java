
package edu.jdc.mvc.view;

import edu.jdc.mvc.control.Control;
import edu.jdc.mvc.modelo.Nodo;
import edu.jdc.mvc.modelo.Producto;
import java.util.Scanner;


public class View {
    private Control controlador;
    private Scanner scanner;

    // Constructor
    public View(Control controlador) {
        this.controlador = controlador;
        scanner = new Scanner(System.in);
    }

    // Método para solicitar y registrar un nuevo producto
    public void registrarProducto() {
        System.out.println("Ingrese el código del producto:");
        String codigo = scanner.nextLine();
        System.out.println("Ingrese el nombre del producto:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el precio del producto:");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        controlador.agregarProducto(codigo, nombre, precio);
        System.out.println("Producto registrado exitosamente.");
    }

    // Método para mostrar la lista de productos registrados
    public void mostrarListaProductos() {
        Nodo nodoActual = controlador.obtenerListaProductos();
        System.out.println("Lista de productos registrados:");
        while (nodoActual != null) {
            Producto producto = nodoActual.getProducto();
            System.out.println("Código: " + producto.getCodigo() + ", Nombre: " + producto.getNombre() + ", Precio: $" + producto.getPrecio());
            nodoActual = nodoActual.getSiguiente();
        }
    }
}

