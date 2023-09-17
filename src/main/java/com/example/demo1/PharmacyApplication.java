package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PharmacyApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader presLoader = new FXMLLoader(PharmacyApplication.class.getResource("prescriptions.fxml"));
        PresController presController = new PresController();
        presLoader.setController(presController);

        FXMLLoader presRefillLoader = new FXMLLoader(PharmacyApplication.class.getResource("prescriptions_refill.fxml"));
        PresRefillController presRefillController = new PresRefillController();
        presRefillLoader.setController(presRefillController);

        FXMLLoader presPassLoader = new FXMLLoader(PharmacyApplication.class.getResource("prescriptions_pass.fxml"));
        PresPassController presPassController = new PresPassController();
        presPassLoader.setController(presPassController);

        FXMLLoader infoLoader = new FXMLLoader(PharmacyApplication.class.getResource("general-info.fxml"));
        infoController infoController = new infoController();
        infoLoader.setController(infoController);

        FXMLLoader appointmentLoader = new FXMLLoader(PharmacyApplication.class.getResource("appointment.fxml"));
        appointmentController appointmentController = new appointmentController();
        appointmentLoader.setController(appointmentController);

        FXMLLoader calenderLoader = new FXMLLoader(PharmacyApplication.class.getResource("calender.fxml"));
        CalenderController calenderController = new CalenderController();
        calenderLoader.setController(calenderController);

        Scene presScene = new Scene(presLoader.load(), 360, 640);
        Scene presRefillScene = new Scene(presRefillLoader.load(), 360, 640);
        Scene presPassScene = new Scene(presPassLoader.load(), 360, 640);
        Scene infoScene = new Scene(infoLoader.load(), 360, 640);
        Scene appointmentScene = new Scene(appointmentLoader.load(), 360, 640);
        Scene calenderScene = new Scene(calenderLoader.load(), 360, 640);

        //PresController presController = (PresController) presLoader.getController();
        presController.setInfoScene(infoScene);
        presController.setAppointmentScene(appointmentScene);
        presController.setRefillScene(presRefillScene);
        presController.setHistoryScene(presPassScene);
        presController.setCalenderScene(calenderScene);

        presRefillController.setInfoScene(infoScene);
        presRefillController.setAppointmentScene(appointmentScene);
        presRefillController.setActiveScene(presScene);
        presRefillController.setHistoryScene(presPassScene);

        presPassController.setInfoScene(infoScene);
        presPassController.setAppointmentScene(appointmentScene);
        presPassController.setActiveScene(presScene);
        presPassController.setRefillScene(presRefillScene);

        infoController.setPreScene(presScene);
        infoController.setAppointmentScene(appointmentScene);
        appointmentController.setInfoScene(infoScene);
        appointmentController.setPreScene(presScene);
        appointmentController.setCalenderScene(calenderScene);

        calenderController.setBackScene(presScene);

        stage.setTitle("Pharmacy Software");
        stage.setScene(presScene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}