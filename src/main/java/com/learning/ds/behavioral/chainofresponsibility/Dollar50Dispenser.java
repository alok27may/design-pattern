package com.learning.ds.behavioral.chainofresponsibility;

public class Dollar50Dispenser implements DispenseChain {
    public static final int FIFTY = 50;
    private DispenseChain nextChain;

    @Override
    public void setNextChain(final DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(final Currency currency) {
        if(currency.getAmount() >= FIFTY){
            int num = currency.getAmount() / FIFTY;
            int remainder = currency.getAmount() % FIFTY;
            System.out.println("Dispensing " + num + " " + FIFTY + "$ note");
            if(remainder !=0) this.nextChain.dispense(new Currency(remainder));
        }else{
            this.nextChain.dispense(currency);
        }

    }
}
