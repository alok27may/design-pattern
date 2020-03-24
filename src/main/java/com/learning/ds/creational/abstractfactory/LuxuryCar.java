package com.learning.ds.creational.abstractfactory;

public class LuxuryCar extends Car {
    public LuxuryCar(final Location location) {
        super(CarType.LUXURY, location);
        construct();
    }

    protected void construct() {
        System.out.println("Constructing Luxury Car");
    }
}
