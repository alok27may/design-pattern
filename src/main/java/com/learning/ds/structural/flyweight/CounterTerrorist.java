package com.learning.ds.structural.flyweight;

public class CounterTerrorist implements Player {
    private String task;
    private String weapon;

    public CounterTerrorist() {
        this.task = "DEFUSE BOMB";
    }

    public void assignWeapon(final String weapon) {
        this.weapon = weapon;
    }

    public void mission() {
        System.out.println("Counter Terrorist with weapon "
                + weapon + "|" + " Task is " + task);
    }
}
