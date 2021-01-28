package com.company.StrategyPattern.child;



import com.company.StrategyPattern.candy.Candy;
import com.company.StrategyPattern.strategy.ChoosingCandyStrategy;

import java.util.List;

public class Child  {


    private ChoosingCandyStrategy choice;
    private int age;

    public Child(ChoosingCandyStrategy choice, int age) {
        this.choice = choice;
        this.age = age;
    }


    public Candy chooseCandy(List<Candy> candyList) {

      return  choice.chooseCandy(candyList, age);


    }



}
