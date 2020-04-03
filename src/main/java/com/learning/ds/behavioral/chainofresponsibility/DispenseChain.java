package com.learning.ds.behavioral.chainofresponsibility;

public interface DispenseChain {
    void setNextChain(DispenseChain nexChain);
    void dispense(Currency currency);
}
