package com.amilcarsystems.recursivetriangle.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class TriangleController {

    @FXML
    private TextField sizeField;

    @FXML
    private ChoiceBox<String> typeChoiceBox;

    @FXML
    private Button drawButton;

    @FXML
    private TextArea triangleArea;

    @FXML
    private Label errorLabel;

    @FXML
    private void initialize() {
        typeChoiceBox.getItems().addAll("Creciente", "Decreciente");
        typeChoiceBox.setValue("Creciente"); // valor por defecto

        drawButton.setOnAction(e -> drawTriangle());
    }

    private void drawTriangle() {
        try {
            int n = Integer.parseInt(sizeField.getText());
            if(n <= 0) {
                errorLabel.setText("El tamaño debe ser mayor que 0.");
                triangleArea.clear();
            } else {
                errorLabel.setText("");
                String triangle;
                if(typeChoiceBox.getValue().equals("Creciente")) {
                    triangle = triTipo1(n);
                } else {
                    triangle = triTipo2(n);
                }
                triangleArea.setText(triangle);
            }
        } catch (NumberFormatException e) {
            errorLabel.setText("Debes ingresar un número válido.");
            triangleArea.clear();
        }
    }

    // Método que crea los elementos de cada fila
    private String trian(int n) {
        if(n <= 0) return "\n";
        else return "* " + trian(n - 1);
    }

    // Triángulo creciente
    private String triTipo1(int n) {
        if(n <= 0) return "";
        else return triTipo1(n - 1) + trian(n);
    }

    // Triángulo decreciente
    private String triTipo2(int n) {
        if(n <= 0) return "";
        else return trian(n) + triTipo2(n - 1);
    }
}
