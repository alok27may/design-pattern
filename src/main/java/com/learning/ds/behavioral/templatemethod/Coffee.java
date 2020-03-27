package com.learning.ds.behavioral.templatemethod;

public class Coffee extends CaffeineBeverage {
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    protected void brew() {
        System.out.println("Dripping coffee through filter");
    }
}
