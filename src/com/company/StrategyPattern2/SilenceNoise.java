package com.company.StrategyPattern2;

public class SilenceNoise implements NoiseBehavior {
    @Override
    public void makeSounds() {
        System.out.println("Silence");
    }
}
