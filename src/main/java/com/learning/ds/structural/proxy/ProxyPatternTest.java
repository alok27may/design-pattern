package com.learning.ds.structural.proxy;

public class ProxyPatternTest {
    public static void main(String[] args) {
        final CommandExecutor proxy = new CommandExecutorProxy("alok", "wrong_pasword");
        try {
            proxy.runCommand("ls -ltr");
            proxy.runCommand("rm -rf abc.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
