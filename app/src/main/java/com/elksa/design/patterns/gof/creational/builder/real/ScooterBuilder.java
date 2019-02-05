package com.elksa.design.patterns.gof.creational.builder.real;

/**
 * The 'ConcreteBuilderC' class
 */
public class ScooterBuilder extends VehicleBuilder {

    public ScooterBuilder() {
        vehicle = new Vehicle("Scooter");
    }

    @Override
    public void buildFrame() {
        vehicle.setPart("frame", "Scooter Frame");
    }

    @Override
    public void buildEngine() {
        vehicle.setPart("engine", "50 cc");
    }

    @Override
    public void buildWheels() {
        vehicle.setPart("wheels", "2");
    }

    @Override
    public void buildDoors() {
        vehicle.setPart("doors", "0");
    }
}
