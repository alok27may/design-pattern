package com.learning.ds.behavioral.observer;

public class ForecastDisplay implements Observer, Display {
    private float temperature;
    private Subject weatherData;

    public ForecastDisplay(final Subject subject) {
        this.weatherData = subject;
        subject.registerObserver(this);
    }

    public void display() {
        String message;
        if (temperature < 20) {
            message = "So cold outside, wear some warm cloth";
        } else if (temperature > 40) {
            message = "Improving weather on the way!";
        } else {
            message = "Watch out for cooler, rainy weather";
        }
        System.out.println(message);
    }

    public void update(final float temperature, final float humidity, final float pressure) {
        this.temperature = temperature;
        display();
    }
}
