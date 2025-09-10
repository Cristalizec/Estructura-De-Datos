package com.amilcarsystems.recursivebinary.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BinaryController {

    @FXML
    private TextField numberField;

    @FXML
    private Button convertButton;

    @FXML
    private Label resultLabel1;

    @FXML
    private Label resultLabel2;

    @FXML
    private void initialize() {
        convertButton.setOnAction(e -> convertToBinary());
    }

    private void convertToBinary() {
        try {
            int N = Integer.parseInt(numberField.getText());
            if(N < 0) {
                resultLabel1.setText("Ingresa un número no negativo.");
                resultLabel2.setText("");
            } else {
                // Solución 1: imprimir como cadena
                StringBuilder sb = new StringBuilder();
                printBinary(N, sb);
                resultLabel1.setText("Binario (solución 1): " + sb.toString());

                // Solución 2: devolver como entero
                int binary2 = binary2(N);
                resultLabel2.setText("Binario (solución 2): " + binary2);
            }
        } catch (NumberFormatException e) {
            resultLabel1.setText("Debes ingresar un número válido.");
            resultLabel2.setText("");
        }
    }

    // Solución 1: método que imprime el binario en StringBuilder
    private void printBinary(int n, StringBuilder sb) {
        if(n < 2) sb.append(n);
        else {
            printBinary(n / 2, sb);
            sb.append(n % 2);
        }
    }

    // Solución 2: método que devuelve el binario como entero
    private int binary2(int n) {
        if(n < 2) return n;
        else return n % 2 + 10 * binary2(n / 2);
    }
}