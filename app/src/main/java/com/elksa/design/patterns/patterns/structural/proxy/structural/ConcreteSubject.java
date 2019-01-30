package com.elksa.design.patterns.patterns.structural.proxy.structural;

public class ConcreteSubject implements ISubject {

    @Override
    public String request() {
        return "Called ConcreteSubject.request()";
    }
}
