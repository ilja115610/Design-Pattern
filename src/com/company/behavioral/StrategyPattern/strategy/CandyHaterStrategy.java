package com.company.behavioral.StrategyPattern.strategy;



import com.company.behavioral.StrategyPattern.candy.Candy;

import java.util.List;
import java.util.Random;

public class CandyHaterStrategy implements ChoosingCandyStrategy {
    @Override
    public Candy chooseCandy(List<Candy> candyList, int childAge) {

        Random rd = new Random();


        return candyList.get(rd.nextInt(candyList.size()));
    }
}
