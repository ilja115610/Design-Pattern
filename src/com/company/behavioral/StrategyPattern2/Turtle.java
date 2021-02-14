package com.company.behavioral.StrategyPattern2;

public class Turtle extends Animal {



    public Turtle(double weight) {
        super(weight);
        animalNoise = new SilenceNoise();
    }


}
