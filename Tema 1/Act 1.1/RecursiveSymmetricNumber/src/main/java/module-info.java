module com.amilcarsystems.recursivesymmetricnumber {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.amilcarsystems.recursivesymmetricnumber to javafx.fxml;
    exports com.amilcarsystems.recursivesymmetricnumber;
    exports com.amilcarsystems.recursivesymmetricnumber.controller;
    opens com.amilcarsystems.recursivesymmetricnumber.controller to javafx.fxml;
}