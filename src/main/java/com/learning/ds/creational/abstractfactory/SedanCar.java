package com.learning.ds.creational.abstractfactory;

public class SedanCar extends Car {

    public SedanCar(final Location location) {
        super(CarType.SEDAN, location);
        construct();
    }

    protected void construct() {
        System.out.println("Constructing Sedan Car");
    }
}
