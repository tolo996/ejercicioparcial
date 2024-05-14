
package edu.jdc.mvc.control;

import edu.jdc.mvc.modelo.Nodo;
import edu.jdc.mvc.modelo.Producto;


public class Control {

    private Nodo primerNodo;

    // Método para agregar un nuevo producto
    public void agregarProducto(String codigo, String nombre, double precio) {
        Producto nuevoProducto = new Producto(codigo, nombre, precio);
        Nodo nuevoNodo = new Nodo(nuevoProducto);

        if (primerNodo == null) {
            primerNodo = nuevoNodo;
        } else {
            Nodo temp = primerNodo;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
        }
    }

    // Método para obtener la lista de productos registrados
    public Nodo obtenerListaProductos() {
        return primerNodo;
    }

}
