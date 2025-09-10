package com.amilcarsystems.recurcividad.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FactorialController {
    @FXML
    private TextField txtNumber;

    @FXML
    private Label lblResult;

    // Método recursivo para calcular factorial
    private int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Caso base
        } else {
            return n * factorial(n - 1); // Llamada recursiva
        }
    }

    // Evento del botón
    @FXML
    private void calculateFactorial() {
        try {
            int number = Integer.parseInt(txtNumber.getText());
            if (number < 0) {
                lblResult.setText("No existe factorial de negativos");
            } else {
                int result = factorial(number);
                lblResult.setText("Factorial de " + number + " = " + result);
            }
        } catch (NumberFormatException e) {
            lblResult.setText("Por favor ingresa un número válido");
        }
    }
}