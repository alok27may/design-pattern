package com.learning.ds.behavioral.state.example2;

public class StatePatternTest {
    public static void main(String[] args) {
        final MobileAlertContext mobileAlertContext = new MobileAlertContext();
        final MobileAlertState vibrationState = new VibrationState();
        final MobileAlertState silentState = new SilentState();

        mobileAlertContext.setState(vibrationState);
        mobileAlertContext.doAlert();

        mobileAlertContext.setState(silentState);
        mobileAlertContext.doAlert();

    }
}
