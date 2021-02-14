package com.company.behavioral.StrategyPattern2;

public class MiuNoise implements NoiseBehavior {

    @Override
    public void makeSounds() {
        System.out.println("Miu-Miu");
    }
}
