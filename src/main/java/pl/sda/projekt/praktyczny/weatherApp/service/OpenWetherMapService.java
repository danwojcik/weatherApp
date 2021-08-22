package pl.sda.projekt.praktyczny.weatherApp.service;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import pl.sda.projekt.praktyczny.weatherApp.model.OpenWeatherMap;

public class OpenWetherMapService {

    private final static String APP_ID = "cee22a9555ecc8610d1206c2d7237bad";

    public OpenWeatherMap getWeather(String city) throws UnirestException {

        // REST version
        final OpenWeatherMap weatherForSelectedCity = Unirest.get("https://api.openweathermap.org/data/2.5/weather?")
                .queryString("q", city)
                .queryString("appid", APP_ID)
                .queryString("units", "metric")
                .asObject(OpenWeatherMap.class)
                .getBody();

        return weatherForSelectedCity;
    }
}
