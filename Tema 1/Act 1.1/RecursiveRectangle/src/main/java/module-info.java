module com.amilcarsystems.recursiverectangle {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.amilcarsystems.recursiverectangle to javafx.fxml;
    exports com.amilcarsystems.recursiverectangle;
    exports com.amilcarsystems.recursiverectangle.controller;
    opens com.amilcarsystems.recursiverectangle.controller to javafx.fxml;
}