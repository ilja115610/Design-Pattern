package com.company.StrategyPattern2;

public class WafNoise implements NoiseBehavior {


    @Override
    public void makeSounds() {
        System.out.println("Waf-Waf");
    }
}