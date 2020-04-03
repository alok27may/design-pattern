package com.learning.ds.behavioral.state.example2;

public class VibrationState implements MobileAlertState {

    @Override
    public void alert() {
        System.out.println("Vibration....");
    }
}
