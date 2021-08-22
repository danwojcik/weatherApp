package pl.sda.projekt.praktyczny.weatherApp.model;

import lombok.Data;

@Data
public class OpenWeatherMapMain {

    private double temp;
    private double feel_like;
    private double temp_min;
    private double temp_max;
    private double pressure;
}
