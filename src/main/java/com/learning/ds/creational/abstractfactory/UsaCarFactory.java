package com.learning.ds.creational.abstractfactory;

public class UsaCarFactory {
    public static Car buildCar(final CarType carType) {
        Car car = null;
        switch (carType) {
            case SMALL:
                car = new SmallCar(Location.USA);
                break;
            case SEDAN:
                car = new SedanCar(Location.USA);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.USA);
                break;
            default:
                break;
        }
        return car;
    }
}
