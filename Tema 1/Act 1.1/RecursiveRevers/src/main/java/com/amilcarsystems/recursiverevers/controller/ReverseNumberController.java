package com.amilcarsystems.recursiverevers.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ReverseNumberController {

    @FXML
    private TextField numberField;

    @FXML
    private Button reverseButton;

    @FXML
    private Label resultLabel;

    @FXML
    private void initialize() {
        reverseButton.setOnAction(e -> reverseNumber());
    }

    private void reverseNumber() {
        try {
            int number = Integer.parseInt(numberField.getText());
            if(number < 0) {
                resultLabel.setText("Ingresa un número positivo.");
            } else {
                String reversed = invert(number);
                resultLabel.setText("Número invertido: " + reversed);
            }
        } catch (NumberFormatException e) {
            resultLabel.setText("Debes ingresar un número válido.");
        }
    }

    // Método recursivo que invierte el número y devuelve como String
    private String invert(int n) {
        if(n < 10) return String.valueOf(n);
        else return (n % 10) + invert(n / 10);
    }
}