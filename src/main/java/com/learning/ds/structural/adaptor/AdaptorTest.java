package com.learning.ds.structural.adaptor;

public class AdaptorTest {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        System.out.println("Sparrow.......");
        sparrow.fly();
        sparrow.makeSound();

        ToyDuck plasticToyDuck = new PlasticToyDuck();
        System.out.println("Plastic ToyDuck.......");
        plasticToyDuck.squeak();

        BirdAdaptor birdAdaptor = new BirdAdaptor(sparrow);
        System.out.println("Bird Adaptor.......");
        birdAdaptor.squeak();

    }
}
