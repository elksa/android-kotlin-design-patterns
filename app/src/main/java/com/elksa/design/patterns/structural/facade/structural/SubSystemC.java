package com.elksa.design.patterns.structural.facade.structural;

public class SubSystemC implements ISubSystem {

    @Override
    public String method() {
        return getClass().getName().concat(".method()\n");
    }
}
