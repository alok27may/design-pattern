package com.learning.ds.behavioral.observer;

public class WeatherStationMainTest {

    public static void main(String[] args) {
        final WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurement(65, 80, 30.5f);
        weatherData.setMeasurement(35, 90, 46.1f);
        weatherData.setMeasurement(10, 30, 12.9f);

    }
}
