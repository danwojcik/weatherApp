package pl.sda.projekt.praktyczny.weatherApp.model;

import lombok.Data;

@Data
public class OpenWeatherMap {
    private String name;
    private OpenWeatherMapMain main;

}
