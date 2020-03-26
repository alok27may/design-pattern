package com.learning.ds.creational.singleton;

public class EagerInitializedSingleton {
    private static EagerInitializedSingleton eagerInitializedSingleton
            = new EagerInitializedSingleton();

    private EagerInitializedSingleton() { }

    public static EagerInitializedSingleton getInstance() {
        return eagerInitializedSingleton;
    }
}
