package com.company.FactoryPattern;

public class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine starting...");
    }
}
