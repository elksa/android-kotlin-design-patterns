package com.elksa.design.patterns.gof.creational.builder.real;

/**
 * The 'ConcreteBuilderA' class
 */
public class MotorCycleBuilder extends VehicleBuilder {

    public MotorCycleBuilder() {
        vehicle = new Vehicle("MotorCycle");
    }

    @Override
    public void buildFrame() {
        vehicle.setPart("frame", "MotorCycle Frame");
    }

    @Override
    public void buildEngine() {
        vehicle.setPart("engine", "500 cc");
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
