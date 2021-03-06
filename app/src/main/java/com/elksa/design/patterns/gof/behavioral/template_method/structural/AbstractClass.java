package com.elksa.design.patterns.gof.behavioral.template_method.structural;

public abstract class AbstractClass {

    protected abstract String primitiveOperation1();
    protected abstract String primitiveOperation2();

    public String templateMethod() {
        return primitiveOperation1().concat(primitiveOperation2());
    }
}
