package com.amilcarsystems.recursiveordercheck.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class OrderCheckController {

    @FXML
    private TextField numberField;

    @FXML
    private Button checkButton;

    @FXML
    private Label ascendingLabel;

    @FXML
    private Label descendingLabel;

    @FXML
    private void initialize() {
        checkButton.setOnAction(e -> checkOrder());
    }

    private void checkOrder() {
        try {
            int num = Integer.parseInt(numberField.getText());
            if(num < 0) {
                ascendingLabel.setText("Ingresa un número no negativo.");
                descendingLabel.setText("");
            } else {
                if(ordenadoCre(num))
                    ascendingLabel.setText("Está ordenado de forma creciente.");
                else
                    ascendingLabel.setText("NO está ordenado de forma creciente.");

                if(ordenadoDecre(num))
                    descendingLabel.setText("Está ordenado de forma decreciente.");
                else
                    descendingLabel.setText("NO está ordenado de forma decreciente.");
            }
        } catch (NumberFormatException e) {
            ascendingLabel.setText("Debes ingresar un número válido.");
            descendingLabel.setText("");
        }
    }

    // obtiene base elevado a exp
    private int poten(int base, int exp) {
        if(exp == 0) return 1;
        else return base * poten(base, exp - 1);
    }

    // obtiene cantidad de dígitos
    private int digitos(int num) {
        if(num == 0) return 0;
        return 1 + digitos(num / 10);
    }

    // verifica si está ordenado de forma creciente
    private boolean ordenadoCre(int num) {
        if(num < 10) return true;
        else {
            int numIzq = num / poten(10, digitos(num) - 1);
            num = num - numIzq * poten(10, digitos(num) - 1);
            int numDer = num / poten(10, digitos(num) - 1);

            if(numIzq <= numDer) return ordenadoCre(num);
            else return false;
        }
    }

    // verifica si está ordenado de forma decreciente
    private boolean ordenadoDecre(int num) {
        if(num < 10) return true;
        else {
            int numIzq = num / poten(10, digitos(num) - 1);
            num = num - numIzq * poten(10, digitos(num) - 1);
            int numDer = num / poten(10, digitos(num) - 1);

            if(numIzq >= numDer) return ordenadoDecre(num);
            else return false;
        }
    }
}