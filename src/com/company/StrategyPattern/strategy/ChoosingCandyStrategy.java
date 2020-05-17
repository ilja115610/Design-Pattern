package com.company.StrategyPattern.strategy;

import com.company.StrategyPattern.candy.Candy;

import java.util.List;

public interface ChoosingCandyStrategy {

    Candy chooseCandy (List<Candy> candyList, int childAge);

}
