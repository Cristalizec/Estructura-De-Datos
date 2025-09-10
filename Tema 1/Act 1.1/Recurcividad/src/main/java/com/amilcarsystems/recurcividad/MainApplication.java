package com.amilcarsystems.recurcividad;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("factorial-view.fxml"));
        Scene scene = new Scene(loader.load(), 400, 200);
        stage.setTitle("Factorial con Recursividad");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}