module com.amilcarsystems.recursivepower {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.amilcarsystems.recursivepower to javafx.fxml;
    exports com.amilcarsystems.recursivepower;
    exports com.amilcarsystems.recursivepower.controller;
    opens com.amilcarsystems.recursivepower.controller to javafx.fxml;
}