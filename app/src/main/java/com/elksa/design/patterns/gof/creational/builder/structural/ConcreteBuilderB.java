package com.elksa.design.patterns.gof.creational.builder.structural;

public class ConcreteBuilderB extends Builder {

    private Product product;

    public ConcreteBuilderB() {
        product = new Product();
    }

    @Override
    public void buildPartA() {
        product.addPart("Part X");
    }

    @Override
    public void buildPartB() {
        product.addPart("Part Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
