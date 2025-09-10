module com.amilcarsystems.recursiverevers {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.amilcarsystems.recursiverevers to javafx.fxml;
    exports com.amilcarsystems.recursiverevers;
    exports com.amilcarsystems.recursiverevers.controller;
    opens com.amilcarsystems.recursiverevers.controller to javafx.fxml;
}