package com.company.behavioral.StrategyPattern2;


public class Main {

    public static void main(String[] args) {


        Animal dog = new Dog(20.0);
        dog.makeNoise();

        Animal cat = new Cat(10.5);

        cat.makeNoise();




    }
}
