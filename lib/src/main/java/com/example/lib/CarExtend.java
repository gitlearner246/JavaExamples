package com.example.lib;

public class CarExtend extends Vehicle {

    String carmodel;
    public CarExtend(String modelOfCar) {
        super(4);
        carmodel = modelOfCar;
    }

    void honk(){
        System.out.println("Beep Beep!");
    }

    @Override
    void start() {
        System.out.println("Car Starts");
    }

    @Override
    void brake() {
        System.out.println("Applying Mechanical Brake");
    }
}
