package com.elksa.design.patterns.gof.creational.builder.real;

/**
 * The 'Director' class
 */
public class Shop {

    public void build(VehicleBuilder builder) {
        builder.buildFrame();
        builder.buildEngine();
        builder.buildWheels();
        builder.buildDoors();
    }
}
