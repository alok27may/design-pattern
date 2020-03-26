package com.learning.ds.behavioral.command;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(final Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOn();
    }
}
