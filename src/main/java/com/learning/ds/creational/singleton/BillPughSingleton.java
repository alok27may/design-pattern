package com.learning.ds.creational.singleton;

public class BillPughSingleton {

    private BillPughSingleton() { }

    private static class SingletonHelper {
        private static BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
