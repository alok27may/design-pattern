package com.learning.ds.behavioral.state.example2;

public class SilentState implements MobileAlertState {

    @Override
    public void alert() {
        System.out.println("Silent....");
    }
}
