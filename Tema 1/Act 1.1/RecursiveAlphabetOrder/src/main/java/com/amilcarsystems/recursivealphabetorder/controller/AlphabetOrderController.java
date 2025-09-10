package com.amilcarsystems.recursivealphabetorder.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AlphabetOrderController {

    @FXML
    private TextField wordField;

    @FXML
    private Button checkButton;

    @FXML
    private Label resultLabel;

    @FXML
    private void initialize() {
        checkButton.setOnAction(e -> checkAlphabetOrder());
    }

    private void checkAlphabetOrder() {
        String word = wordField.getText().trim();
        if(word.isEmpty()) {
            resultLabel.setText("Debes ingresar una palabra.");
        } else {
            if(isAlphabeticallyOrdered(word)) {
                resultLabel.setText("La palabra está ordenada alfabéticamente.");
            } else {
                resultLabel.setText("La palabra NO está ordenada alfabéticamente.");
            }
        }
    }

    // Método recursivo que comprueba orden alfabético
    private boolean isAlphabeticallyOrdered(String cad) {
        cad = cad.toLowerCase();
        if(cad.length() > 1) {
            if(cad.charAt(0) <= cad.charAt(1))
                return isAlphabeticallyOrdered(cad.substring(1));
            else
                return false;
        } else {
            return true;
        }
    }
}
