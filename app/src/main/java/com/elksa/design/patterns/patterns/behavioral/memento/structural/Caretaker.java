package com.elksa.design.patterns.patterns.behavioral.memento.structural;

import java.util.Stack;

public class Caretaker {

    private Stack<Memento> mementos;

    public Caretaker() {
        this.mementos = new Stack<>();
    }

    public void storeMemento(Memento memento) {
        mementos.add(memento);
    }

    public Memento getPreviousMemento() {
        return mementos.isEmpty() ? null : mementos.pop();
    }
}
