package com.elksa.design.patterns.behavioral.memento.structural;

import android.support.annotation.NonNull;
import android.util.Log;

public class Originator {

    private String state;

    public Originator(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restoreMemento(@NonNull Memento memento) {
        state = memento.getState();
        Log.d(Originator.class.getName(), "State restored to: " + state);
    }
}
