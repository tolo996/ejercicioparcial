package edu.jdc.run;

import edu.jdc.control.Control;
import edu.jdc.modelo.Modelo;
import edu.jdc.view.View;

public class Runner {

    public static void main(String[] args) {
        Modelo model = new Modelo();
        View view = new View();
        Control controller = new Control(model, view);

        controller.processUserInput();

    }
}
