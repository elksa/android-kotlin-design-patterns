package com.elksa.design.patterns.patterns.behavioral.template_method;

public class ConcreteClassB extends AbstractClass {

    @Override
    protected String primitiveOperation1() {
        return "ConcreteClassB.primitiveOperation1()";
    }

    @Override
    protected String primitiveOperation2() {
        return "ConcreteClassB.primitiveOperation2()";
    }
}
