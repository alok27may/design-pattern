package com.learning.ds.creational.prototype;

public class Show implements PrototypeCapable {

    private String name;

    public Show() {
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Show clone() throws CloneNotSupportedException {
        System.out.println("cloning show object ...");
        return (Show) super.clone();
    }

    @Override
    public String toString() {
        return "Show";
    }
}
