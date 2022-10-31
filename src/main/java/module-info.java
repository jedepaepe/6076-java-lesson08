module com.example.lesson08 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lesson08 to javafx.fxml;
    exports com.example.lesson08;
}