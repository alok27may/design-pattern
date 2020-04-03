package com.learning.ds.behavioral.state.example2;

public class MobileAlertContext {
    private MobileAlertState state;

    public MobileAlertState getState() {
        return state;
    }

    public void setState(final MobileAlertState state) {
        this.state = state;
    }

    public void doAlert() {
        this.state.alert();
    }


}
