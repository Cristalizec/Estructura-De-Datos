package com.amilcarsystems.sumadenumerosnaturales.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

public class NumerosNaturalesController {

    @FXML
    private ListView<Integer> List;

    @FXML
    private TextField txt;

    public void onAdd() {
        List.getItems().add((txt.getText()));

    }
}
