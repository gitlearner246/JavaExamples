package com.example.lib;

public class MyClass {

    public static void main(String[] args) {

//        CarExtend myCar = new CarExtend("C300");
//        myCar.start();
//        myCar.honk();
//        myCar.stop();

        Vehicle v1 = new CarExtend("BMW");
        Vehicle v2 = new Truck(6);


        v1.start();
        v2.start();

        v1.brake();
        v2.brake();
    }
}
