package com.learning.ds.structural.adaptor;

public class BirdAdaptor implements ToyDuck {
    private Bird bird;

    public BirdAdaptor(final Bird bird) {
        this.bird = bird;
    }

    public void squeak() {
        bird.makeSound();
    }
}
