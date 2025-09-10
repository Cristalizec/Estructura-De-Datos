package com.amilcarsystems.recursiverectangle.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RectangleController {

    @FXML
    private TextField heightField;

    @FXML
    private TextField widthField;

    @FXML
    private Button drawButton;

    @FXML
    private TextArea rectangleArea;

    @FXML
    private Label errorLabel;

    @FXML
    private void initialize() {
        drawButton.setOnAction(e -> drawRectangle());
    }

    private void drawRectangle() {
        try {
            int height = Integer.parseInt(heightField.getText());
            int width = Integer.parseInt(widthField.getText());

            if(height <= 0 || width <= 0) {
                errorLabel.setText("Altura y base deben ser mayores que 0.");
                rectangleArea.clear();
            } else {
                errorLabel.setText("");
                rectangleArea.setText(drawRecRectangle(height, width));
            }
        } catch (NumberFormatException e) {
            errorLabel.setText("Debes ingresar números válidos.");
            rectangleArea.clear();
        }
    }

    // Método recursivo que construye el rectángulo
    private String drawRecRectangle(int height, int width) {
        if(height <= 0) return "";
        else return drawLine(width) + "\n" + drawRecRectangle(height - 1, width);
    }

    // Método recursivo que construye una línea de asteriscos
    private String drawLine(int width) {
        if(width <= 0) return "";
        else return "* " + drawLine(width - 1);
    }
}