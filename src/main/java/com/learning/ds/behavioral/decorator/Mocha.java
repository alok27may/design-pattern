package com.learning.ds.behavioral.decorator;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(final Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }

    public double getCost() {
        return this.beverage.getCost() + 5.30;
    }
}
