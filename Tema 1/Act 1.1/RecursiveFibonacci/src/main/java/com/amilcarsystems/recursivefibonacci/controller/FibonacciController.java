package com.amilcarsystems.recursivefibonacci.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FibonacciController {

    @FXML
    private TextField numberInputField;

    @FXML
    private Button calculateButton;

    @FXML
    private Label resultLabel1;

    @FXML
    private Label resultLabel2;

    @FXML
    private Label resultLabel3;

    @FXML
    private void initialize() {
        calculateButton.setOnAction(e -> calculateFibonacci());
    }

    private void calculateFibonacci() {
        try {
            int num = Integer.parseInt(numberInputField.getText());
            if(num < 0) {
                resultLabel1.setText("Ingresa un número no negativo.");
                resultLabel2.setText("");
                resultLabel3.setText("");
            } else {
                resultLabel1.setText("Fibonacci1 de " + num + " = " + fibonacci1(num));
                resultLabel2.setText("Fibonacci2 de " + num + " = " + fibonacci2(num));
                resultLabel3.setText("Fibonacci3 de " + num + " = " + fibonacci3(num));
            }
        } catch (NumberFormatException e) {
            resultLabel1.setText("Debes ingresar un número válido.");
            resultLabel2.setText("");
            resultLabel3.setText("");
        }
    }

    // Solución 1
    private int fibonacci1(int n) {
        if (n > 1) return fibonacci1(n-1) + fibonacci1(n-2);
        else if (n == 1) return 1;
        else return 0;
    }

    // Solución 2
    private int fibonacci2(int n) {
        if (n > 1) return fibonacci2(n-1) + fibonacci2(n-2);
        else return n;
    }

    // Solución 3
    private int fibonacci3(int n) {
        if (n < 2) return n;
        else return fibonacci3(n-1) + fibonacci3(n-2);
    }
}