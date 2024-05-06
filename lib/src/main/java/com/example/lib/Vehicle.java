package com.example.lib;

public abstract class Vehicle {
    int numberOfWheels;

    public Vehicle(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    void start(){
        System.out.println("The vichle Starts");
    }

    void stop(){
        System.out.println("The vichle Stops");
    }

    abstract void brake();
}
