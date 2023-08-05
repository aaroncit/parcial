package com.example.intentofinal;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.io.IOException;


public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Button btnButton12;

    public void sample_bt12() throws IOException {
        Stage stage = (Stage) btnButton12.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("hello2.fxml"));
        primaryStage.setTitle("Pagina 2");
        primaryStage.setScene(new Scene(root, 725, 400));
        primaryStage.show();

    }
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
