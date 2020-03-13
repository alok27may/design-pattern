package com.learning.ds.behavioral.strategy;

import java.text.ParseException;

public class MiniDuckSimulator {
    public static void main(String[] args) throws ParseException {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

    }
}
