package com.company.BuilderPattern;

public class TestBuilder {

    public static void main(String[] args) {

        Vehicle newCar = new Vehicle.Builder("Honda","Accord").color("Red").price(10000).build();

        System.out.println(newCar);


    }
}
