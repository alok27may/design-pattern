package com.learning.ds.creational.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {
    public static void main(String[] args) {
        EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instance2 = null;
        try {
            Constructor[] declaredConstructor = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : declaredConstructor) {
                constructor.setAccessible(true);
                instance2 = (EagerInitializedSingleton) constructor.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instance1);
        System.out.println(instance2);
    }
}
