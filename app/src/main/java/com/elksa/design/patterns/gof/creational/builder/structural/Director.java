package com.elksa.design.patterns.gof.creational.builder.structural;

public class Director {

    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
