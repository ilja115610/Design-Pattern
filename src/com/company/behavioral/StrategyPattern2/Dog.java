package com.company.behavioral.StrategyPattern2;

import com.company.behavioral.StrategyPattern2.strategies.WafNoise;

public class Dog extends Animal{


    public Dog(double weight) {
        super(weight);
        animalNoise = new WafNoise();
    }


}
