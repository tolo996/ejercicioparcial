
package edu.jdc.control;

import edu.jdc.modelo.Modelo;
import edu.jdc.view.View;

public class Control {
    
    private Modelo model;
    private View view;

    public Control(Modelo model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUserInput() {
        String input = view.getUserInput();
        model.evaluate(input);
        view.showResult(model.getResult());
    }
}

