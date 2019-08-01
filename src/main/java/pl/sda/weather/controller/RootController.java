    package pl.sda.weather.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class RootController {

    @FXML
    private TextField city;

    @FXML
    private Button find;

    @FXML
    private Label temperature;


    public void getWeather(ActionEvent actionEvent) {
        System.out.println("KLIK");
        temperature.setText("nowa wartość");
        temperature.setText( city.getText());
        find.resize(40,40);


    }


}
