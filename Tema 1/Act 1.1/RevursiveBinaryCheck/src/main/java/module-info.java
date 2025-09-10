module com.amilcarsystems.revursivebinarycheck {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.amilcarsystems.revursivebinarycheck to javafx.fxml;
    exports com.amilcarsystems.revursivebinarycheck;
    exports com.amilcarsystems.revursivebinarycheck.controller;
    opens com.amilcarsystems.revursivebinarycheck.controller to javafx.fxml;
}