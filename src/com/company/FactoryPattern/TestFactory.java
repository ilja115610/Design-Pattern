package com.company.FactoryPattern;

public class TestFactory {

    public static void main(String[] args) {

        VehicleFactory factory = new VehicleFactory();
        Vehicle bus = factory.getVehicle(VehicleType.BUS);
        bus.startEngine();

    }
}
