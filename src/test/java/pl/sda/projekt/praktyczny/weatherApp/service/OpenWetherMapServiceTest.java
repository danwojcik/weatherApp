package pl.sda.projekt.praktyczny.weatherApp.service;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.junit.jupiter.api.*;
import pl.sda.projekt.praktyczny.weatherApp.http.ObjectMapperGsonImpl;
import pl.sda.projekt.praktyczny.weatherApp.model.OpenWeatherMap;

class OpenWetherMapServiceTest {

    private static OpenWetherMapService service;

    @BeforeAll
    static void setup() {
        Unirest.setObjectMapper(new ObjectMapperGsonImpl());

        service = new OpenWetherMapService();
    }

    @AfterAll
    static void cleaning() {}

    @Test
    @DisplayName("test calling OpenWeather API")
    void test1() throws UnirestException {

        final OpenWeatherMap weatherForRzeszow = service.getWeather("Rzeszów");

        Assertions.assertEquals(weatherForRzeszow.getName(), "Rzeszów");
        Assertions.assertTrue(weatherForRzeszow.getMain().getTemp() > 0.0);
    }

}