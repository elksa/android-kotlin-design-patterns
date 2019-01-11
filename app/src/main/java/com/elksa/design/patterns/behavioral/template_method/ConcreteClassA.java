package com.elksa.design.patterns.behavioral.template_method;

public class ConcreteClassA extends AbstractClass {

    @Override
    protected String primitiveOperation1() {
        return "ConcreteClassA.primitiveOperation1()";
    }

    @Override
    protected String primitiveOperation2() {
        return "ConcreteClassA.primitiveOperation2()";
    }
}
