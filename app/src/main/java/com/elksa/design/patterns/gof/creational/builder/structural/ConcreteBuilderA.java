package com.elksa.design.patterns.gof.creational.builder.structural;

public class ConcreteBuilderA extends Builder {

    private Product product;

    public ConcreteBuilderA() {
        product = new Product();
    }

    @Override
    public void buildPartA() {
        product.addPart("Part C");
    }

    @Override
    public void buildPartB() {
        product.addPart("Part D");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
