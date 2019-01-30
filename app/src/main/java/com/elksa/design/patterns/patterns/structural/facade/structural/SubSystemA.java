package com.elksa.design.patterns.patterns.structural.facade.structural;

public class SubSystemA implements ISubSystem {

    @Override
    public String method() {
        return getClass().getName().concat(".method()\n");
    }
}
