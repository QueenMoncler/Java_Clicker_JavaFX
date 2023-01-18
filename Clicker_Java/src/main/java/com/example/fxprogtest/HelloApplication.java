package com.example.fxprogtest;


import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("log.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 444, 534);
        stage.setTitle("Window Auth");
        stage.setScene(scene);
        stage.show();
    }



    public static void main(String[] args) {


        launch();


    }
}