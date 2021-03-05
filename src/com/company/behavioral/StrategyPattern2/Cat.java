package com.company.behavioral.StrategyPattern2;

import com.company.behavioral.StrategyPattern2.strategies.MiuNoise;

public class Cat extends Animal{

    public Cat(double weight) {
        super(weight);
        animalNoise = new MiuNoise();
    }


}
