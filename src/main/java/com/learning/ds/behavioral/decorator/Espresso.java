package com.learning.ds.behavioral.decorator;

public class Espresso extends Beverage {

    public Espresso() {
        this.description = "Espresso";
    }

    public double getCost() {
        return 10.50;
    }
}
