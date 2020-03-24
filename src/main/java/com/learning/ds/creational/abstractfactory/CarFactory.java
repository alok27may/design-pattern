package com.learning.ds.creational.abstractfactory;

public class CarFactory {
    public static Car buildCar(final CarType carType) {
        Car car = null;

        final Location location = Location.ASIA;
        switch (carType) {
            case SMALL:
                car = new SmallCar(location);
                break;
            case SEDAN:
                car = new SedanCar(location);
                break;
            case LUXURY:
                car = new LuxuryCar(location);
                break;
            default:
                break;
        }
        return car;
    }
}
