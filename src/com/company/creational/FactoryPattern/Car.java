package com.company.creational.FactoryPattern;

public class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine starting...");
    }
}
