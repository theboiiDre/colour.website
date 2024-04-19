module com.example.builder {
    requires javafx.controls;
    requires javafx.fxml;
    requires mysql.connector.j;


    opens com.example.builder to javafx.fxml;
    exports com.example.builder;
}