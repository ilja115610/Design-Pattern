package com.company.behavioral.StrategyPattern2;

public abstract class Animal {

    private double weight;

    protected NoiseBehavior animalNoise;

    public Animal(double weight) {
        this.weight = weight;
    }

   public void makeNoise (){
        animalNoise.makeSounds();
   }

}
