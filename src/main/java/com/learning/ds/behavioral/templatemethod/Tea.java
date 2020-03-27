package com.learning.ds.behavioral.templatemethod;

public class Tea extends CaffeineBeverage {
    protected void addCondiments() {
        System.out.println("Adding Lemon");
    }

    protected void brew() {
        System.out.println("Steeping the tea");
    }
}
