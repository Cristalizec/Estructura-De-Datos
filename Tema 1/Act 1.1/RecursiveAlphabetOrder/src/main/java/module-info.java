module com.amilcarsystems.recursivealphabetorder {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.amilcarsystems.recursivealphabetorder to javafx.fxml;
    exports com.amilcarsystems.recursivealphabetorder;
    exports com.amilcarsystems.recursivealphabetorder.controller;
    opens com.amilcarsystems.recursivealphabetorder.controller to javafx.fxml;
}