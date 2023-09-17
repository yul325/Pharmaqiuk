package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class infoController {
    private Scene preScene;
    private Scene appointmentScene;
    @FXML
    private Button pres_button;

    @FXML
    private Button shot_button;

    @FXML
    void switchPresMenu(ActionEvent event) {
        Stage primaryStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        primaryStage.setScene(preScene);
    }

    @FXML
    void switchShotMenu(ActionEvent event) {
        Stage primaryStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        primaryStage.setScene(appointmentScene);
    }

    void setPreScene(Scene scene){
        preScene = scene;
    }

    void setAppointmentScene(Scene scene){
        appointmentScene = scene;
    }

}
