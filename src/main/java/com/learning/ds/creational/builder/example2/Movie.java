package com.learning.ds.creational.builder.example2;

public class Movie implements PrototypeCapable {

    private String name;

    public Movie() {
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Movie clone() throws CloneNotSupportedException {
        System.out.println("cloning movie object ...");
        return (Movie) super.clone();
    }

    @Override
    public String toString() {
        return "Movie";
    }
}
