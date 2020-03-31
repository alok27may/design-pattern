package com.learning.ds.creational.builder;

public class Computer {
    private String hdd;
    private String ram;
    private boolean graphicsCardEnabled;
    private boolean bluetoothEnabled;

    private Computer(final ComputerBuilder computerBuilder) {
        this.hdd = computerBuilder.hdd;
        this.ram = computerBuilder.ram;
        this.graphicsCardEnabled = computerBuilder.graphicsCardEnabled;
        this.bluetoothEnabled = computerBuilder.bluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "hdd='" + hdd + '\'' +
                ", ram='" + ram + '\'' +
                ", graphicsCardEnabled=" + graphicsCardEnabled +
                ", bluetoothEnabled=" + bluetoothEnabled +
                '}';
    }

    public static class ComputerBuilder {
        private String hdd;
        private String ram;
        private boolean graphicsCardEnabled;
        private boolean bluetoothEnabled;

        public ComputerBuilder(final String hdd, final String ram) {
            this.hdd = hdd;
            this.ram = ram;
        }

        public ComputerBuilder setGraphicsCardEnabled(final boolean graphicsCardEnabled) {
            this.graphicsCardEnabled = graphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(final boolean bluetoothEnabled) {
            this.bluetoothEnabled = bluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }
}
