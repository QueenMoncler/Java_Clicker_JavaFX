package com.example.fxprogtest;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class StoreController extends HelloController{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label NicknameLabel;

    @FXML
    private TextField Score;

    @FXML
    private Button back_home_button;

    @FXML
    private Text blockpitania_price;

    @FXML
    private Button buy_blockpitania_button;

    @FXML
    private Button buy_matplata_button;

    @FXML
    private Button buy_operativka_button;

    @FXML
    private Button buy_processor_button;

    @FXML
    private Button buy_videokarta_button;

    @FXML
    private AnchorPane mainwindow;

    @FXML
    private Text materinka_price;

    @FXML
    private Text operativka_price;

    @FXML
    private Text processor_price;

    @FXML
    private Text videokarta_price;

    @FXML
    void initialize()  {

        buy_processor_button.setOnAction(actionEvent -> {
            try {
                setAuto_click(1f);
                System.out.println("GOOD");
            } finally {

            }

        });


        back_home_button.setOnAction(actionEvent -> {

            Stage stage = (Stage) back_home_button.getScene().getWindow();
            stage.close();
             WindowOpenOut windowOpenOut = new WindowOpenOut();
             windowOpenOut.clicker();
        });



    }

}

