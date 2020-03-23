package com.learning.ds.behavioral.decorator;

public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(final Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }

    public double getCost() {
        return this.beverage.getCost() + 4.50;
    }
}
