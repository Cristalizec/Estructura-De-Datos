module com.amilcarsystems.recurcividad {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.amilcarsystems.recurcividad to javafx.fxml;
    exports com.amilcarsystems.recurcividad;
    exports com.amilcarsystems.recurcividad.controller;
    opens com.amilcarsystems.recurcividad.controller to javafx.fxml;
}