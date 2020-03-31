package com.learning.ds.structural.proxy;

public class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin;
    private CommandExecutor commandExecutor;

    public CommandExecutorProxy(final String username, final String password) {
        if ("alok".equals(username) && "kumar".equals(password)) {
            isAdmin = true;
        }
        commandExecutor = new CommandExecutorImpl();

    }

    @Override
    public void runCommand(final String command) throws Exception {
        if (isAdmin) {
            commandExecutor.runCommand(command);
        } else {
            if(command.trim().startsWith("rm")){
                throw new Exception("rm command is not allowed for non-admin users.");
            }else{
                commandExecutor.runCommand(command);
            }
        }

    }
}
