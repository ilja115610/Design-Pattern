package com.company.creational.FactoryPattern;

public class Truck implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Truck engine starting...");
    }
}
