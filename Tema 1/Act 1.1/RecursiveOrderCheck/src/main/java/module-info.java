module com.amilcarsystems.recursiveordercheck {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.amilcarsystems.recursiveordercheck to javafx.fxml;
    exports com.amilcarsystems.recursiveordercheck;
    exports com.amilcarsystems.recursiveordercheck.controller;
    opens com.amilcarsystems.recursiveordercheck.controller to javafx.fxml;
}