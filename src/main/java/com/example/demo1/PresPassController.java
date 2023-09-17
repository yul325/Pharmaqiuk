package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Node;

public class PresPassController {
    private Scene infoScene;
    private Scene appointmentScene;

    private Scene activeScene;
    private Scene refillScene;
    @FXML
    private Button active_button;
    @FXML
    private Button refill_button;

    @FXML
    private Button info_button;

    @FXML
    private Button shot_button;

    @FXML
    void switchInfoMenu(ActionEvent event) {
        Stage primaryStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        primaryStage.setScene(infoScene);
    }

    @FXML
    void switchShotMenu(ActionEvent event) {
        Stage primaryStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        primaryStage.setScene(appointmentScene);
    }

    @FXML
    void switchActive(ActionEvent event) {
        Stage primaryStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        primaryStage.setScene(activeScene);
    }
    @FXML
    void switchRefill(ActionEvent event) {
        Stage primaryStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        primaryStage.setScene(refillScene);
    }



    void setInfoScene(Scene scene){
        infoScene = scene;
    }

    void setAppointmentScene(Scene scene){
        appointmentScene = scene;
    }

    void setActiveScene(Scene scene){
        activeScene = scene;
    }

    void setRefillScene(Scene scene){
        refillScene = scene;
    }

}
