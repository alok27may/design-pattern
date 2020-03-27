package com.learning.ds.structural.decorator;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "DarkRoast";
    }

    public double getCost() {
        return 22.50;
    }
}
