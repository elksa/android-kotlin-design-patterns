package com.elksa.design.patterns.gof.creational.builder.real;

/**
 * The 'Builder' abstract class
 */
public abstract class VehicleBuilder {

    protected Vehicle vehicle;

    public Vehicle getVehicle() {
        return vehicle;
    }

    // Abstract build methods
    public abstract void buildFrame();
    public abstract void buildEngine();
    public abstract void buildWheels();
    public abstract void buildDoors();
}
