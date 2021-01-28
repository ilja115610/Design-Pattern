package com.company.StrategyPattern2;

public class Dog extends Animal{


    public Dog(double weight) {
        super(weight);
        animalNoise = new WafNoise();
    }


}
