module com.example.fxprogtest {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.fxprogtest to javafx.fxml;
    exports com.example.fxprogtest;
}