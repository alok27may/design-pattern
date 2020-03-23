package com.learning.ds.creational.factory;

public class SedanCar extends Car {

    public SedanCar() {
        super(CarType.SEDAN);
        construct();
    }

    protected void construct() {
        System.out.println("Constructing Sedan Car");
    }
}
