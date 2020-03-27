package com.learning.ds.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PanCakeHouseMenuIterator implements Iterator {

    private ArrayList<Menu> menu;
    private int position = 0;

    public PanCakeHouseMenuIterator(final ArrayList menu) {
        this.menu = menu;
    }

    public boolean hasNext() {
        if (position >= menu.size() || menu.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    public Object next() {
        Menu menuItem = menu.get(position);
        position = position + 1;
        return menuItem;
    }

    public void remove() {

    }
}
