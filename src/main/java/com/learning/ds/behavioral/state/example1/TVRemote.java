package com.learning.ds.behavioral.state.example1;

public class TVRemote {
    public static void main(String[] args) {
        final TVContext tvContext = new TVContext();
        final TVStartState tvStartState = new TVStartState();
        final TVStopState tvStopState = new TVStopState();

        tvContext.setState(tvStartState);
        tvContext.doAction();

        tvContext.setState(tvStopState);
        tvContext.doAction();
    }
}
