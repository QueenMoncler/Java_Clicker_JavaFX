package com.example.fxprogtest;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class logController {

    @FXML
    private Button ButtonJoin;

    @FXML
    private TextField NicknameInput;

    @FXML
    private AnchorPane mainwindow;


    @FXML
    void initialize(){
      //  DayaBaseHandler dbHandler = new DayaBaseHandler();


        ButtonJoin.setOnAction(actionEvent -> {
            String loginText = NicknameInput.getText().trim();
            if(!loginText.equals("")){
                loginUser(loginText);
                HelloController.Nickname_User.Nickname = loginText;

                //Открытие кликер-окна
                ButtonJoin.getScene().getWindow().hide();
                WindowOpenOut windowOpenOut = new WindowOpenOut();
                windowOpenOut.clicker();

            }
            else{
                System.out.println("ERROR");
            }


        });
    }

    private void loginUser(String loginText) {
    }
}
