package com.learning.ds.behavioral.chainofresponsibility;

public class Dollar10Dispenser implements DispenseChain {
    public static final int TEN = 10;
    private DispenseChain nextChain;

    @Override
    public void setNextChain(final DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(final Currency currency) {
        if(currency.getAmount() >= TEN){
            int num = currency.getAmount() / TEN;
            int remainder = currency.getAmount() % TEN;
            System.out.println("Dispensing " + num + " " + TEN + "$ note");
            if(remainder !=0) this.nextChain.dispense(new Currency(remainder));
        }else{
            this.nextChain.dispense(currency);
        }

    }
}
