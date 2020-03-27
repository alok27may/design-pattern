package com.learning.ds.structural.facade;

public class TheaterLights {
    public void dim(final int deamUnit) {
        System.out.println("Theater light is dimming by " + deamUnit);
    }

    public void on() {
        System.out.println("Theater light is on");
    }
}
