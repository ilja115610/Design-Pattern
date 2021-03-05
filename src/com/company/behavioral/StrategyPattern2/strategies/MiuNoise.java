package com.company.behavioral.StrategyPattern2.strategies;

public class MiuNoise implements NoiseBehavior {

    @Override
    public void makeSounds() {
        System.out.println("Miu-Miu");
    }
}
