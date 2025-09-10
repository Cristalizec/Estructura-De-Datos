package com.amilcarsystems.recursivepelindrome.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PalindromeController {

    @FXML
    private TextField wordField;

    @FXML
    private Button checkButton;

    @FXML
    private Label resultLabel;

    @FXML
    private void initialize() {
        checkButton.setOnAction(e -> checkPalindrome());
    }

    private void checkPalindrome() {
        String word = wordField.getText().trim();
        if(word.isEmpty()) {
            resultLabel.setText("Debes ingresar una palabra.");
        } else {
            if(isPalindrome(word)) {
                resultLabel.setText("Es un palíndromo.");
            } else {
                resultLabel.setText("No es un palíndromo.");
            }
        }
    }

    // Método recursivo que comprueba palíndromo
    private boolean isPalindrome(String frase) {
        frase = frase.toLowerCase();
        if(frase.length() <= 1) return true;
        else {
            if(frase.charAt(0) == frase.charAt(frase.length() - 1))
                return isPalindrome(frase.substring(1, frase.length() - 1));
            else
                return false;
        }
    }
}