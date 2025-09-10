module com.amilcarsystems.recursivebinary {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.amilcarsystems.recursivebinary to javafx.fxml;
    exports com.amilcarsystems.recursivebinary;
    exports com.amilcarsystems.recursivebinary.controller;
    opens com.amilcarsystems.recursivebinary.controller to javafx.fxml;
}