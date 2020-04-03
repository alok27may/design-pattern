package com.learning.ds.behavioral.chainofresponsibility;

public class Dollar20Dispenser implements DispenseChain {
    public static final int TWENTY = 20;
    private DispenseChain nextChain;

    @Override
    public void setNextChain(final DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(final Currency currency) {
        if(currency.getAmount() >= TWENTY){
            int num = currency.getAmount() / TWENTY;
            int remainder = currency.getAmount() % TWENTY;
            System.out.println("Dispensing " + num + " " + TWENTY + "$ note");
            if(remainder !=0) this.nextChain.dispense(new Currency(remainder));
        }else{
            this.nextChain.dispense(currency);
        }

    }
}
