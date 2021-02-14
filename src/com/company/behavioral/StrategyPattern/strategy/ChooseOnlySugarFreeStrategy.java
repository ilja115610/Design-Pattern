package com.company.behavioral.StrategyPattern.strategy;

import com.company.behavioral.StrategyPattern.candy.Candy;

import java.util.List;

public class ChooseOnlySugarFreeStrategy implements ChoosingCandyStrategy {

    @Override
    public Candy chooseCandy(List<Candy> candyList, int childAge) {

        Candy shortest = candyList.get(0);
        boolean min = true;
        while ( min) {
            min = false;
            for (Candy k : candyList) {
            if(k.getType().length()<shortest.getType().length()) {
                shortest = k;
                min = true;
            }
            }
        }
        return shortest;

    }
}
