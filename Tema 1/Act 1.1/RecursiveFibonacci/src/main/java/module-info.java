module com.amilcarsystems.recursivefibonacci {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.amilcarsystems.recursivefibonacci to javafx.fxml;
    exports com.amilcarsystems.recursivefibonacci;
    exports com.amilcarsystems.recursivefibonacci.controller;
    opens com.amilcarsystems.recursivefibonacci.controller to javafx.fxml;
}