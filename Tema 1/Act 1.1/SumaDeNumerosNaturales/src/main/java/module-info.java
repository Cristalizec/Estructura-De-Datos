module com.amilcarsystems.sumadenumerosnaturales {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.amilcarsystems.sumadenumerosnaturales to javafx.fxml;
    exports com.amilcarsystems.sumadenumerosnaturales;
    exports com.amilcarsystems.sumadenumerosnaturales.controller;
    opens com.amilcarsystems.sumadenumerosnaturales.controller to javafx.fxml;
}