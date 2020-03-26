package com.learning.ds.creational.singleton;

public class LazyInitializedSingleton {
    private static LazyInitializedSingleton lazyInitializedSingleton;
    private LazyInitializedSingleton() {}
    public static LazyInitializedSingleton getInstance() {
        if (null == lazyInitializedSingleton) {
            lazyInitializedSingleton = new LazyInitializedSingleton();
        }
        return lazyInitializedSingleton;
    }
}
