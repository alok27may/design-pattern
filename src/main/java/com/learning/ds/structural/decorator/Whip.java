package com.learning.ds.structural.decorator;

public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(final Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }

    public double getCost() {
        return this.beverage.getCost() + 2.50;
    }
}
