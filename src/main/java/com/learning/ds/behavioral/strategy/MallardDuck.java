package com.learning.ds.behavioral.strategy;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWing();
    }
    public void display() {
        System.out.println("Mallard Duck !!");
    }
}
