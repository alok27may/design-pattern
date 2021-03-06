package com.learning.ds.creational.abstractfactory;

public class DefaultCarFactory {
    public static Car buildCar(final CarType carType) {
        Car car = null;
        switch (carType) {
            case SMALL:
                car = new SmallCar(Location.DEFAULT);
                break;
            case SEDAN:
                car = new SedanCar(Location.DEFAULT);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.DEFAULT);
                break;
            default:
                break;
        }
        return car;
    }
}
