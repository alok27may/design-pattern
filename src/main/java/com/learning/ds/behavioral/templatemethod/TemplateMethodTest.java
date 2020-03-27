package com.learning.ds.behavioral.templatemethod;

public class TemplateMethodTest {
    public static void main(String[] args) {
        final CaffeineBeverage tea = new Tea();
        System.out.println("Tea.....");
        tea.prepareRecipe();

        final CaffeineBeverage coffee = new Coffee();
        System.out.println("Coffee.....");
        coffee.prepareRecipe();
    }
}
