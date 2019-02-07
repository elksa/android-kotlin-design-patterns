package com.elksa.design.patterns.gof.behavioral.template_method.structural;

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
