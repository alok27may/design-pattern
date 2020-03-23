package com.learning.ds.creational.factory;

public class LuxuryCar extends Car {
    public LuxuryCar() {
        super(CarType.LUXURY);
        construct();
    }

    protected void construct() {
        System.out.println("Constructing Luxury Car");
    }
}
