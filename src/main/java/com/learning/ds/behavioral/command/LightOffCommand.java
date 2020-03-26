package com.learning.ds.behavioral.command;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(final Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOff();
    }
}
