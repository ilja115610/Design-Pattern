package com.company.StrategyPattern2;

public class Cat extends Animal{

    public Cat(double weight) {
        super(weight);
        animalNoise = new MiuNoise();
    }


}
