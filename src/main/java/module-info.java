module com.example.intentofinal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.intentofinal to javafx.fxml;
    exports com.example.intentofinal;
}