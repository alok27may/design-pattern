package com.learning.ds.structural.facade;

public class DvdPlayer {
    public void play(final String movie) {
        System.out.println("DvdPlayer is playing movie " + movie);
    }

    public void stop() {
        System.out.println("DvdPlayer is Stopped");
    }

    public void eject() {
        System.out.println("DvdPlayer is ejected");
    }

    public void off() {
        System.out.println("DvdPlayer is Off");
    }
}
