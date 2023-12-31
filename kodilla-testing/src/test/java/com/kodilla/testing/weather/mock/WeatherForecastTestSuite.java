package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

    @Mock
    private Temperatures temperaturesMock;

    @Test
    void testCalculateForecastWithMock() {
        //Given
//        Temperatures temperaturesMock = mock(Temperatures.class);

        WeatherForecast weatherForecast = getWeatherForecast();

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }
//TODO: @BeforeAll
    private WeatherForecast getWeatherForecast() {
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
//        temperaturesMap.put("Wawel", 26.3);

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        return new WeatherForecast(temperaturesMock);
    }

    @Test
    void testCalculateAverageTemperatureWithMock() {
        WeatherForecast weatherForecast = getWeatherForecast();

        double result = weatherForecast.calculateAverageTemperature();

        Assertions.assertEquals(25.56, result);
    }

    @Test
    void testCalculateMedianWithMock() {
        WeatherForecast weatherForecast = getWeatherForecast();

        double result = weatherForecast.calculateMedian();

        Assertions.assertEquals(25.5, result);
//        Assertions.assertEquals(25.8, result);
    }

}
