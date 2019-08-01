package pl.sda.weather.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import pl.sda.weather.WeatherService;


public class RootController {

    @FXML
    private TextField city;

    @FXML
    private Button find;

    @FXML
    private Label temperature;


    public void getWeather(ActionEvent actionEvent) {

        WeatherService weatherService = new WeatherService("http://api.apixu.com/v1/current.json",
                "6dfd28dca0f6486e86581449191307");
        FasterImplementation fasterImplementation = new FasterImplementation(weatherService, city.getText());

        String temperatureC = Float.toString(fasterImplementation.getWeather().getCurrent().getTemp_c());

        temperature.setText(temperatureC);

//
//        System.out.println("KLIK");
//        temperature.setText("nowa wartość");
//        temperature.setText(city.getText());
//        find.resize(40, 40);


    }


}
