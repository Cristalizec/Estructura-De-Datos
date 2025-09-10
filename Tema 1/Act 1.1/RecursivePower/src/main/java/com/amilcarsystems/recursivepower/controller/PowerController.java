package com.amilcarsystems.recursivepower.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PowerController {

    @FXML
    private TextField baseField;

    @FXML
    private TextField exponentField;

    @FXML
    private Button calculateButton;

    @FXML
    private Label resultLabel;

    @FXML
    private void initialize() {
        calculateButton.setOnAction(e -> calculatePower());
    }

    private void calculatePower() {
        try {
            int base = Integer.parseInt(baseField.getText());
            int exponent = Integer.parseInt(exponentField.getText());

            if(exponent < 0) {
                resultLabel.setText("Ingresa un exponente no negativo.");
            } else {
                int result = power(base, exponent);
                resultLabel.setText(base + " elevado a " + exponent + " = " + result);
            }
        } catch (NumberFormatException e) {
            resultLabel.setText("Debes ingresar números válidos.");
        }
    }

    // Método recursivo que calcula potencia
    private int power(int base, int exp) {
        if(exp == 0) return 1; // cualquier número elevado a 0 es 1
        else if(exp == 1) return base;
        else return base * power(base, exp - 1);
    }
}