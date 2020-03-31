package com.learning.ds.structural.bridge;

public abstract class Shape {
    protected Color color;

    public Shape(final Color color) {
        this.color = color;
    }

    abstract void applyColor();
}
