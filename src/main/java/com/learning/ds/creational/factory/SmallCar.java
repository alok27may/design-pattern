package com.learning.ds.creational.factory;

public class SmallCar extends Car {

    public SmallCar() {
        super(CarType.SMALL);
        construct();
    }

    protected void construct() {
        System.out.println("Constructing Small Car");
    }
}
