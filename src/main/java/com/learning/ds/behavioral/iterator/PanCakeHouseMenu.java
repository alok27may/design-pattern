package com.learning.ds.behavioral.iterator;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.Iterator;

public class PanCakeHouseMenu {
    private ArrayList<Menu> menuList;

    public PanCakeHouseMenu() {
        menuList = new ArrayList<Menu>();
        addItem("K&B’s Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast", true,
                2.99);
        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage", false,
                2.99);
        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries", true,
                3.49);
        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries", true,
                3.59);
    }

    public void addItem(final String name, final String description, final boolean vegetarian, final double price) {
        Menu menu = new Menu(name, description, vegetarian, price);
        menuList.add(menu);
    }
    public ArrayList<Menu> getMenu() {
        return menuList;
    }


    public Iterator createIterator() {
        return new PanCakeHouseMenuIterator(menuList);
    }
}
