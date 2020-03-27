package com.learning.ds.behavioral.templatemethod;

public abstract class CaffeineBeverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    private void pourInCup() {
        System.out.println("Pouring in Cup");
    }

    private void boilWater() {
        System.out.println("Boiling Water");
    }
}
