package com.elksa.design.patterns.patterns.behavioral.command.structural;

public abstract class Command {

    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract String execute();
}
