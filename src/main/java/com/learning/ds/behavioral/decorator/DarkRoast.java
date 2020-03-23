package com.learning.ds.behavioral.decorator;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "DarkRoast";
    }

    public double getCost() {
        return 22.50;
    }
}
