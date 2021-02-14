package com.company.behavioral.StrategyPattern.strategy;

import com.company.behavioral.StrategyPattern.candy.Candy;

import java.util.List;

public interface ChoosingCandyStrategy {

    Candy chooseCandy (List<Candy> candyList, int childAge);

}
