package com.learning.ds.behavioral.iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
    private Menu[] items;
    private int position = 0;

    public DinerMenuIterator(Menu[] items) {
        this.items = items;
    }

    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    public Object next() {
        Menu menuItem = items[position]; position = position + 1;
        return menuItem;
    }

    public void remove() {

    }
}
