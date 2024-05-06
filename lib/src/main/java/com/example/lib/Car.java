package com.example.lib;

public class Car {
        private int year;
        private int speed;

        void accelerate() {
            speed += 10;
            System.out.println("your new speed is: " + speed);
        }

        void brake() {
            speed -= 5;
            System.out.println("your new speed is: " + speed);
        }

        // Constructor
        public Car(int carSpeed, int carYear) {
            year = carYear;
            speed = carSpeed;
        }

        // Getters & Setters
    public int getYear(){
            return year;
    }

    public void setYear(int newYear){
        year = newYear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
