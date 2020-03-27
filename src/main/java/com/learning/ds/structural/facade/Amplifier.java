package com.learning.ds.structural.facade;

public class Amplifier {
    private DvdPlayer dvdPlayer;

    public void on() {
        System.out.println("Amplifier is on");
    }

    public void setSurroundSound() {
        System.out.println("Amplifier surround sound is set");
    }

    public void setDvd(final DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public void setVolume(final int volumeLevel) {
        System.out.println("Amplifier volume is set to " + volumeLevel);
    }

    public void off() {
        System.out.println("Amplifier is Off");
    }
}
