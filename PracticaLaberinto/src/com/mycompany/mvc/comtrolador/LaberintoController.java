
package com.mycompany.mvc.comtrolador;

import com.mycompany.mvc.modelo.Laberinto;
import com.mycompany.mvc.vista.View;

public class LaberintoController {
    private Laberinto laberinto;
    private View vista;

    public LaberintoController(Laberinto laberinto, View vista) {
        this.laberinto = laberinto;
        this.vista = vista;
    }

    public void iniciarJuego() {
        vista.mostrarMensaje("Bienvenido al laberinto. Tu tesoro es: " + laberinto.getTesoro());

        String[] obstaculos = laberinto.getObstaculos();
        String[] acertijos = laberinto.getAcertijos();

        for (int i = 0; i < obstaculos.length; i++) {
            vista.mostrarMensaje("Te encuentras frente a un obstaculo: " + obstaculos[i]);
            vista.mostrarMensaje("Para superarlo, debes resolver el acertijo: " + acertijos[i]);
            vista.mostrarMensaje("Ingresa 1 para resolver el acertijo o 0 para salir.");

            int respuesta = vista.obtenerRespuesta();

            if (respuesta == 1) {
                boolean resuelto = laberinto.resolverAcertijo(i);
                if (resuelto) {
                    vista.mostrarMensaje("¡Has obtenido la llave!");
                    laberinto.getLlaves()[i] = true;
                } else {
                    vista.mostrarMensaje("El acertijo no se ha resuelto. Continua tu busqueda.");
                }
            } else {
                vista.mostrarMensaje("Has decidido salir del laberinto. ¡Hasta pronto!");
                return;
            }
        }

        vista.mostrarMensaje("¡Felicidades! Has obtenido todas las llaves y alcanzado el tesoro: " + laberinto.getTesoro());
    }
}
