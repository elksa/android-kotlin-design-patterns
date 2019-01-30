package com.elksa.design.patterns.patterns.behavioral.command.structural;

public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public String executeCommand() {
        return command.execute();
    }
}
