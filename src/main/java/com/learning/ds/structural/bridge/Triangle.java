package com.learning.ds.structural.bridge;

public class Triangle extends Shape {

    public Triangle(final Color color) {
        super(color);
    }

    void applyColor() {
        System.out.print("Triangle filled with color ");
        color.applyColor();
    }
}
