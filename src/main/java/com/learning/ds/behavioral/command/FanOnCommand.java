package com.learning.ds.behavioral.command;

public class FanOnCommand implements Command {
    private Fan fan;

    public FanOnCommand(final Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        fan.startRotate();
    }
}
