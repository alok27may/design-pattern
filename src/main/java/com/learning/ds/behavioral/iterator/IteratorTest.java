package com.learning.ds.behavioral.iterator;

public class IteratorTest {
    public static void main(String[] args) {
        PanCakeHouseMenu pancakeHouseMenu = new PanCakeHouseMenu();
        DinnerMenu dinerMenu = new DinnerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
