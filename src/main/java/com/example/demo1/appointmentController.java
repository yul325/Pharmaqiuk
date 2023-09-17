package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class appointmentController {
    private Scene preScene;
    private Scene infoScene;

    private Scene calenderScene;
    @FXML
    private Button pres_button;

    @FXML
    private  Button calender_button;
    @FXML
    private Button info_button;

    @FXML
    void switchPresMenu(ActionEvent event) {
        Stage primaryStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        primaryStage.setScene(preScene);
    }

    @FXML
    void switchInfoMenu(ActionEvent event) {
        Stage primaryStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        primaryStage.setScene(infoScene);
    }

    @FXML
    void switchCalender(ActionEvent event){
        Stage primaryStage = (Stage)((Node) event.getSource()).getScene().getWindow();
        primaryStage.setScene(calenderScene);
    }

    void setPreScene(Scene scene){
        preScene = scene;
    }

    void setInfoScene(Scene scene){
        infoScene = scene;
    }

    void setCalenderScene(Scene scene){
        calenderScene = scene;
    }

}
