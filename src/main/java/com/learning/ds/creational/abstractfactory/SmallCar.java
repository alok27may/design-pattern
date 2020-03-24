package com.learning.ds.creational.abstractfactory;

public class SmallCar extends Car {

    public SmallCar(final Location location) {
        super(CarType.SMALL, location);
        construct();
    }

    protected void construct() {
        System.out.println("Constructing Small Car");
    }
}
