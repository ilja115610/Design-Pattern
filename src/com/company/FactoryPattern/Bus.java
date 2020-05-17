package com.company.FactoryPattern;

public class Bus implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Bus engine starting...");
    }
}
