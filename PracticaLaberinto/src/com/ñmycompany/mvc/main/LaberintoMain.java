
package com.ñmycompany.mvc.main;

import com.mycompany.mvc.comtrolador.LaberintoController;
import com.mycompany.mvc.modelo.Laberinto;
import com.mycompany.mvc.vista.View;


public class LaberintoMain {
    public static void main(String[] args) {
        String tesoro = "La verdad interior";
        String[] obstaculos = {"Espejo", "un abanico", "la pupila"};
        String[] acertijos = {"¿Si dices mi nombre se rompe?", "Me ves en verano y no en invierno y estoy metido en entre las manos, "
                + "ya sea abierto o cerrado. ¿Que soy?", "Parte del humano que tiene la capacidad de aumentar por 9 su tamaño. ¿Qué es?"};

        Laberinto laberinto = new Laberinto(tesoro, obstaculos, acertijos);
        View vista = new View();
        LaberintoController controlador = new LaberintoController(laberinto, vista);

        controlador.iniciarJuego();
    }
}
