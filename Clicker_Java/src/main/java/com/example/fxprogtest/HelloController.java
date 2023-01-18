package com.example.fxprogtest;

import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.Timer;
import java.util.TimerTask;


public  class HelloController {
    private float clickbut = 0.00010f;
    private float auto_click = 0.00005f;
    private float price = 0.00015f;
    private float score_gettext_auto;

    public void setAuto_click(float score_gettext_auto) {
        this.auto_click += score_gettext_auto;
    }

    public static class Nickname_User{
        protected static String Nickname;
    }
    @FXML
    private Button ButtonImprove;


    @FXML
    private Label NicknameLabel;
    @FXML
    private Text ClickScore;

    @FXML
    private Text Price;
    @FXML
    private TextField Score;


    @FXML
    private Button buttonScore;

    @FXML
    private AnchorPane mainwindow;

    @FXML
    private Button store_button;

     @FXML
        void startprog(){
       // Score.setText("0.00000");
        ClickScore.setText(String.format("%.5f", auto_click));
        Price.setText(String.format("%.5f", price));

     }


    @FXML
    void initialize() throws InterruptedException {
        NicknameLabel.setText(Nickname_User.Nickname);


         store_button.setOnAction(actionEvent -> {
             Stage stg = (Stage) store_button.getScene().getWindow();
             stg.close();
             WindowOpenOut windowOpenOut = new WindowOpenOut();
             windowOpenOut.store();

         });

    startprog();


        // авто-клик
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
               score_gettext_auto = Float.parseFloat(Score.getText());
               score_gettext_auto += auto_click;
                // auto_click += auto_click;
                Score.setText(formattedDouble(score_gettext_auto));
            }

        }, 0, 1000);






        // центральная кнопка кликера
        buttonScore.setOnAction(actionEvent -> {
          float score_gettext_click = Float.parseFloat(Score.getText());
            score_gettext_click += auto_click;
           Score.setText(formattedDouble(score_gettext_click));
       });





        // кнопка улучшения(1)
       ButtonImprove.setOnAction(actionEvent -> {
            float score_gettext = Float.parseFloat(Score.getText());
            if(price >  score_gettext ){
                System.out.println("ERROR");
            }
            else{
                score_gettext -= price;


                price*=10;
                auto_click*=2;


                Score.setText(formattedDouble(score_gettext));


                ClickScore.setText(String.format("%.5f", auto_click));
                Price.setText(String.format("%.5f", price));
            }
    });



     }







    public String formattedDouble(float x){
        String formattedDoubleR = String.format("%.5f", x);
        return formattedDoubleR.replace(',', '.');
    }


    public String score_clicker_forStore(){
         String score;

         score = Score.getText();

         return score;
    }

}

