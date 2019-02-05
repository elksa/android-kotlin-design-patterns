package com.elksa.design.patterns.gof.creational.builder.real;

/**
 * The 'ConcreteBuilderB' class
 */
public class CarBuilder extends VehicleBuilder {

    public CarBuilder() {
        vehicle = new Vehicle("Car");
    }

    @Override
    public void buildFrame() {
        vehicle.setPart("frame", "Car Frame");
    }

    @Override
    public void buildEngine() {
        vehicle.setPart("engine", "2500 cc");
    }

    @Override
    public void buildWheels() {
        vehicle.setPart("wheels", "4");
    }

    @Override
    public void buildDoors() {
        vehicle.setPart("doors", "4");
    }
}
