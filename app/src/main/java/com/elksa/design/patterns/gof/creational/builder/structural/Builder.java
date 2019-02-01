package com.elksa.design.patterns.gof.creational.builder.structural;

public abstract class Builder {

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract Product getResult();
}
