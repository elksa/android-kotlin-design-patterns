package com.elksa.design.patterns.gof.structural.facade.structural;

public class SubSystemC implements ISubSystem {

    @Override
    public String method() {
        return getClass().getName().concat(".method()\n");
    }
}
