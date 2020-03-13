package com.learning.ds.behavioral.strategy;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All Duck Can Swim !!");
    }

    public void setFlyBehavior(final FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(final QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
