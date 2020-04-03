package com.learning.ds.behavioral.state.example1;

public class TVContext implements State {

    private State state;

    public void setState(final State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    @Override
    public void doAction() {
        this.state.doAction();
    }
}
