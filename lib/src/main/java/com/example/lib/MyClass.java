package com.example.lib;

public class MyClass {
    public static void methodA() {
        System.out.println("Method A inner called");
    }

    public static void countdown(int start) {
        System.out.println("Value method received:" + start);
        System.out.println("Countdown started");
        for (int i = start; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static double getAreaOfCircle(double radius){
        return radius * radius * 3.14;
    }


    public static void main(String[] args) {
        countdown(3);
        countdown(10);
        double circleArea = getAreaOfCircle(2.5);
        System.out.println("Size of circle with 2.5 radius is " + circleArea);
    }
}