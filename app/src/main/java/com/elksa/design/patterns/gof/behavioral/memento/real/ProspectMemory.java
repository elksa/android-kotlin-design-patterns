package com.elksa.design.patterns.gof.behavioral.memento.real;

/**
 * The 'Caretaker' class
 */
public class ProspectMemory {

    private Memento memento;

    public ProspectMemory() {
    }

    public ProspectMemory(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
