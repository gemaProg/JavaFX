package com.example.fxhelloworld;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private CheckBox checkBoxPrueba;
    @FXML

    protected void onHelloButtonClick() {

        welcomeText.setText("Welcome to JavaFX Application!");
        if (checkBoxPrueba.isSelected())
            welcomeText.setText("Welcome to JavaFX Application!");
        else
            welcomeText.setText("Selecciona check");
        System.out.println("Click en el botón");
    }
}
