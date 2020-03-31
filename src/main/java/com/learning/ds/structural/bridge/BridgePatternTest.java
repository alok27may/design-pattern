package com.learning.ds.structural.bridge;

public class BridgePatternTest {
    public static void main(String[] args) {
        final Shape triangle = new Triangle(new RedColor());
        triangle.applyColor();

        final Shape pentagon = new Pentagon(new GreenColor());
        pentagon.applyColor();
    }
}
