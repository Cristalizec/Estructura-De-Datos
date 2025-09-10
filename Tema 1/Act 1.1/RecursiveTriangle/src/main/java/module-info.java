module com.amilcarsystems.recursivetriangle {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.amilcarsystems.recursivetriangle to javafx.fxml;
    exports com.amilcarsystems.recursivetriangle;
    exports com.amilcarsystems.recursivetriangle.controller;
    opens com.amilcarsystems.recursivetriangle.controller to javafx.fxml;
}