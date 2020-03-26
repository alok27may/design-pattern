package com.learning.ds.creational.singleton;

public class SingletonTest {

    public static void main(String[] args) {
        printSingletonResult(EagerInitializedSingleton.getInstance(), EagerInitializedSingleton.getInstance());
        printSingletonResult(StaticBlockSingleton.getInstance(), StaticBlockSingleton.getInstance());
        printSingletonResult(LazyInitializedSingleton.getInstance(), LazyInitializedSingleton.getInstance());
        printSingletonResult(BillPughSingleton.getInstance(), BillPughSingleton.getInstance());
        printSingletonResult(ThreadSafeSingleton.getInstance(), ThreadSafeSingleton.getInstance());
        printSingletonResult(EnumSingleton.INSTANCE, EnumSingleton.INSTANCE);

    }

    private static void printSingletonResult(final Object object1, final Object object2) {
        System.out.println(object1.getClass().getSimpleName() + " : " + (object1 == object2));
    }


}
