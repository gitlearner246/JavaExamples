package com.example.lib;

public class Truck extends Vehicle {
    public Truck(int numberOfWheels) {
        super(numberOfWheels);
    }

    @Override
    void start() {
        System.out.println("Truck Starts");
    }

    @Override
    void brake() {
        System.out.println("Applying Hydraulic Brake");
    }
}
