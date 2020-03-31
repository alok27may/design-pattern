package com.learning.ds.structural.flyweight;

public class Terrorist implements Player {
    private String task;
    private String weapon;

    public Terrorist() {
        this.task = "PLANT A BOMB";
    }

    public void assignWeapon(final String weapon) {
        this.weapon = weapon;
    }

    public void mission() {
        System.out.println("Terrorist with weapon "
                + weapon + "|" + " Task is " + task);
    }
}
