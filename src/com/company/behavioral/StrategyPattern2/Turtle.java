package com.company.behavioral.StrategyPattern2;

import com.company.behavioral.StrategyPattern2.strategies.SilenceNoise;

public class Turtle extends Animal {



    public Turtle(double weight) {
        super(weight);
        animalNoise = new SilenceNoise();
    }


}
