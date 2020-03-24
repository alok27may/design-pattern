package com.learning.ds.creational.abstractfactory;

public abstract class Car {
    private CarType carType;
    private Location location;
    public Car(CarType carType, Location location) {
        this.carType = carType;
        this.location = location;
        arrangeParts();

    }

    protected void arrangeParts() {
        System.out.println("Base Class Do something ");
    }

    protected abstract void construct();

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(final CarType carType) {
        this.carType = carType;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(final Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Model : " + carType + " built in : " + location;
    }
}
