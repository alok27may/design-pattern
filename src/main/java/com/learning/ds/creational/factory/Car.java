package com.learning.ds.creational.factory;

public abstract class Car {
    private CarType carType;
    public Car(CarType carType) {
        this.carType = carType;
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
}
