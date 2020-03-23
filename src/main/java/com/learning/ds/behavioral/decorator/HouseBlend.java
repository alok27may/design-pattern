package com.learning.ds.behavioral.decorator;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        this.description = "HouseBlend";
    }

    public double getCost() {
        return 11.15;
    }
}
