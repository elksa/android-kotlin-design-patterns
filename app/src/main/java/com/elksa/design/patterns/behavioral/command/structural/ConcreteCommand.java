package com.elksa.design.patterns.behavioral.command.structural;

public class ConcreteCommand extends Command {

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public String execute() {
        return receiver.action();
    }
}
