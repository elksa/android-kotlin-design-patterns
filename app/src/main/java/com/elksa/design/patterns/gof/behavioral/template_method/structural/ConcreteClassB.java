package com.elksa.design.patterns.gof.behavioral.template_method.structural;

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
