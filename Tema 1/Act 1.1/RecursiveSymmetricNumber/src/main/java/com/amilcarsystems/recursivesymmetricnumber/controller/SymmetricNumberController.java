package com.amilcarsystems.recursivesymmetricnumber.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SymmetricNumberController {

    @FXML
    private TextField numberField;

    @FXML
    private Button checkButton;

    @FXML
    private Label resultLabel;

    @FXML
    private void initialize() {
        checkButton.setOnAction(e -> checkSymmetric());
    }

    private void checkSymmetric() {
        try {
            int num = Integer.parseInt(numberField.getText());
            if(num < 0) {
                resultLabel.setText("Ingresa un número no negativo.");
            } else {
                if(isSymmetric(num))
                    resultLabel.setText("El número es simétrico.");
                else
                    resultLabel.setText("El número NO es simétrico.");
            }
        } catch (NumberFormatException e) {
            resultLabel.setText("Debes ingresar un número válido.");
        }
    }

    // devuelve la cantidad de dígitos
    private int digitos(int num) {
        if(num == 0) return 0;
        return 1 + digitos(num / 10);
    }

    // devuelve base elevado a exp
    private int poten(int base, int exp) {
        if(exp == 1) return base;
        else return base * poten(base, exp - 1);
    }

    // comprueba si el número es simétrico
    private boolean isSymmetric(int num) {
        if(digitos(num) <= 1)
            return true;
        else {
            int desp = poten(10, digitos(num) - 1);
            if(num / desp != num % 10)
                return false;
            else
                return isSymmetric((num - (num / desp) * desp) / 10);
        }
    }
}