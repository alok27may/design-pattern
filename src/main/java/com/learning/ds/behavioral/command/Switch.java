package com.learning.ds.behavioral.command;

public class Switch {
    private Command up;
    private Command down;

    public Switch(final Command up, final Command down) {
        this.up = up;
        this.down = down;
    }

    public void flipUp() {
        up.execute();
    }

    public void flipDown() {
        down.execute();
    }
}
