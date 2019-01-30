package com.elksa.design.patterns.patterns.structural.facade.structural;

public class SubSystemB implements ISubSystem {

    @Override
    public String method() {
        return getClass().getName().concat(".method()\n");
    }
}
