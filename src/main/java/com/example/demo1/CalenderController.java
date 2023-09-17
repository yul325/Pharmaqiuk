package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Node;
public class CalenderController {

    @FXML
    private Button confirm_button;

    private Scene preScene;

    @FXML
    private Button back_button;

    @FXML
    void success(ActionEvent event) {
    }

    @FXML
    void back(ActionEvent event) {
        Stage primaryStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        primaryStage.setScene(preScene);
    }

    void setBackScene(Scene scene){
        preScene = scene;
    }
}