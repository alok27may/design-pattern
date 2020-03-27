package com.learning.ds.behavioral.iterator;

import java.util.Iterator;

public class Waitress {
    private PanCakeHouseMenu panCakeHouseMenu;
    private DinnerMenu dinnerMenu;

    public Waitress(final PanCakeHouseMenu panCakeHouseMenu, final DinnerMenu dinnerMenu) {
        this.panCakeHouseMenu = panCakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = panCakeHouseMenu.createIterator();
        Iterator dinerIterator = dinnerMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    private void printMenu(final Iterator iterator) {
        while (iterator.hasNext()) {
            Menu menuItem = (Menu)iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

}
