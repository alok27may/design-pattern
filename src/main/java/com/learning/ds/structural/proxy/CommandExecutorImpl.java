package com.learning.ds.structural.proxy;

public class CommandExecutorImpl implements CommandExecutor {
    @Override
    public void runCommand(final String command) throws Exception {
        Runtime.getRuntime().exec(command);
        System.out.println(command + " command executed.");
    }
}
