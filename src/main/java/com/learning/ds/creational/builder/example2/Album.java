package com.learning.ds.creational.builder.example2;

public class Album implements PrototypeCapable {

    private String name;

    public Album() {
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Album clone() throws CloneNotSupportedException {
        System.out.println("cloning album object ...");
        return (Album) super.clone();
    }

    @Override
    public String toString() {
        return "Album";
    }
}
