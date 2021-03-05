package com.company.behavioral.StrategyPattern2.strategies;

public class WafNoise implements NoiseBehavior {


    @Override
    public void makeSounds() {
        System.out.println("Waf-Waf");
    }
}
