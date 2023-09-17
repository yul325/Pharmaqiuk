package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Node;

public class PresController {
    private Scene infoScene;
    private Scene appointmentScene;
    private Scene refillScene;
    private Scene historyScene;

    private Scene calenderScene;

    @FXML
    private Button pickUp_button;
    @FXML
    private Button refill_button;
    @FXML
    private Button history_button;
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
    void switchRefill(ActionEvent event) {
        Stage primaryStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        primaryStage.setScene(refillScene);
    }
    @FXML
    void switchHistory(ActionEvent event) {
        Stage primaryStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        primaryStage.setScene(historyScene);
    }

    @FXML
    void switchCalender(ActionEvent event) {
        Stage primaryStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        primaryStage.setScene(calenderScene);
    }
    void setInfoScene(Scene scene){
        infoScene = scene;
    }

    void setAppointmentScene(Scene scene){
        appointmentScene = scene;
    }

    void setRefillScene(Scene scene){
        refillScene = scene;
    }

    void setHistoryScene(Scene scene){
        historyScene = scene;
    }
    void setCalenderScene(Scene scene){
        calenderScene = scene;
    }
}
