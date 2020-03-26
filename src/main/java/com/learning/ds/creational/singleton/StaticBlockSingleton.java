package com.learning.ds.creational.singleton;

public class StaticBlockSingleton {
    private static StaticBlockSingleton staticBlockSingleton;

    static {
        try {
            staticBlockSingleton = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Unable to create static block singleton object", e);
        }
    }

    private StaticBlockSingleton() {}

    public static StaticBlockSingleton getInstance() {
        return staticBlockSingleton;
    }

}
