package com.learning.ds.behavioral.command;

public class CommandTest {
    public static void main(String[] args) {
        final Light light = new Light();
        final LightOnCommand lightOnCommand = new LightOnCommand(light);
        final LightOffCommand lightOffCommand = new LightOffCommand(light);
        final Switch switchLight = new Switch(lightOnCommand, lightOffCommand);
        switchLight.flipUp();
        switchLight.flipDown();

        Fan fan = new Fan();
        final FanOnCommand fanOnCommand = new FanOnCommand(fan);
        final FanOffCommand fanOffCommand = new FanOffCommand(fan);
        final Switch switchFan = new Switch(fanOnCommand, fanOffCommand);
        switchFan.flipUp();
        switchFan.flipDown();
    }
}
