package com.learning.ds.behavioral.observer;

public class CurrentConditionDisplay implements Display, Observer {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject subject) {
        this.weatherData = subject;
        subject.registerObserver(this);
    }

    public void display() {
        System.out.println("Current Condition :: " + temperature
        + " F degrees and " + humidity + " % humidity.");
    }

    public void update(final float temperature, final float humidity, final float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
