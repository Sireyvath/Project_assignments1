module com.example.project_assignment {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.datatransfer;
    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.project_assignment to javafx.fxml;
    exports com.example.project_assignment;
}