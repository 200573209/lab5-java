module org.example.lab5java {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.lab5java to javafx.fxml;
    exports org.example.lab5java;
}