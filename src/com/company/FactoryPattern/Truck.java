package com.company.FactoryPattern;

public class Truck implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Truck engine starting...");
    }
}
