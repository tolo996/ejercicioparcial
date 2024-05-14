/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jdc.mvc.control;

import edu.jdc.mvc.model.Producto;
import java.util.ArrayList;


public class Control {
     private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(String nombre, double precio) {
        Producto producto = new Producto(nombre, precio);
        productos.add(producto);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

}
