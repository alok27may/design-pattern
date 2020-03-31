package com.learning.ds.structural.bridge;

public class Pentagon extends Shape {

    public Pentagon(final Color color) {
        super(color);
    }

    void applyColor() {
        System.out.print("Pentagon filled with color ");
        color.applyColor();
    }
}
