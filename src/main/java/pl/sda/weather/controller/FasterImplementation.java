package pl.sda.weather.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.weather.WeatherService;
import pl.sda.weather.model.Weather;

import java.io.File;
import java.io.IOException;

public class FasterImplementation  {

    private WeatherService weatherService;
    private String city;

    public FasterImplementation(WeatherService weatherService, String city) {
        this.weatherService = weatherService;
        this.city = city;

    }

    public Weather getWeather() {

        ObjectMapper objectMapper = new ObjectMapper();
        Weather weather = null;

        try {
            weather = objectMapper.readValue(this.weatherService.getJSONData(this.city), Weather.class);
            objectMapper.writeValue(new File("data.json"), weather);
        } catch (IOException e) {


            e.printStackTrace();
        }

        return weather;
    }


}
