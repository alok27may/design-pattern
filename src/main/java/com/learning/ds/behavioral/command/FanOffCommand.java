package com.learning.ds.behavioral.command;

public class FanOffCommand implements Command {
    private Fan fan;

    public FanOffCommand(final Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        fan.stopRotating();
    }
}
