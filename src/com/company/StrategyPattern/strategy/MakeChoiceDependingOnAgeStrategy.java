package com.company.StrategyPattern.strategy;

import candy.Candy;

import java.util.List;
import java.util.Random;

public class MakeChoiceDependingOnAgeStrategy implements ChoosingCandyStrategy {
    @Override
    public Candy chooseCandy(List<Candy> candyList, int childAge) {

        Random rand = new Random();
        for (Candy k : candyList) {
            if (k.getType().length() == childAge) {
                return k;
            }
        }

        return candyList.get(rand.nextInt(candyList.size()));
    }
}
