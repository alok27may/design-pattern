package com.learning.ds.behavioral.iterator;

public class Menu {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public Menu(final String name, final String description, final boolean vegetarian, final double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }
}
