module com.amilcarsystems.recursivepelindrome {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.amilcarsystems.recursivepelindrome to javafx.fxml;
    exports com.amilcarsystems.recursivepelindrome;
    exports com.amilcarsystems.recursivepelindrome.controller;
    opens com.amilcarsystems.recursivepelindrome.controller to javafx.fxml;
}