package com.amilcarsystems.revursivebinarycheck.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BinaryCheckController {

    @FXML
    private TextField numberField;

    @FXML
    private Button checkButton;

    @FXML
    private Label resultLabel;

    @FXML
    private void initialize() {
        checkButton.setOnAction(e -> checkBinary());
    }

    private void checkBinary() {
        try {
            int num = Integer.parseInt(numberField.getText());
            if(num < 0) {
                resultLabel.setText("Ingresa un número no negativo.");
            } else {
                if(isBinary(num)) {
                    resultLabel.setText("El número está en binario.");
                } else {
                    resultLabel.setText("El número NO está en binario.");
                }
            }
        } catch (NumberFormatException e) {
            resultLabel.setText("Debes ingresar un número válido.");
        }
    }

    // Método recursivo que verifica si el número está en binario
    private boolean isBinary(int n) {
        if(n > 9) {
            if(n % 10 == 0 || n % 10 == 1)
                return isBinary(n / 10);
            else
                return false;
        } else if(n == 0 || n == 1) {
            return true;
        } else {
            return false;
        }
    }
}
