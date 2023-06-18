package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double calculateAverageTemperature() {
        Collection<Double> values = temperatures.getTemperatures().values();
        double sum = 0;
        double size = values.size();
        for (Double value: values) {
            sum += value;
        }
        return sum / size;
    }

    public double calculateMedian() {
        Collection<Double> values = temperatures.getTemperatures().values();
        double[] array = values.stream().mapToDouble(Double::doubleValue).toArray();
        Arrays.sort(array);
        double median;
        if (array.length % 2 == 0) {
            median = (array[array.length / 2] + array[array.length / 2 - 1]) / 2;
        } else {
            median = array[(array.length - 1) / 2];
        }
        return median;
    }
}