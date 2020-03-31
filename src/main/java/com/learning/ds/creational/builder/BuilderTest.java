package com.learning.ds.creational.builder;

public class BuilderTest {
    public static void main(String[] args) {
        final Computer computer = new Computer.ComputerBuilder("500 GB", "4 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();
        System.out.println(computer);
    }
}
