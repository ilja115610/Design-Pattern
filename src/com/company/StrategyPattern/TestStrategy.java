package com.company.StrategyPattern;


import com.company.StrategyPattern.candy.Candy;
import com.company.StrategyPattern.child.Child;
import com.company.StrategyPattern.strategy.CandyHaterStrategy;
import com.company.StrategyPattern.strategy.ChooseOnlySugarFreeStrategy;
import com.company.StrategyPattern.strategy.MakeChoiceDependingOnAgeStrategy;

import java.util.ArrayList;

public class TestStrategy {

    public static void main(String[] args) {


        ArrayList<Candy> list = new ArrayList<>();
        Candy c1 = new Candy ("Chocolate");
        Candy c2 = new Candy ("Caramel");
        Candy c3 = new Candy ("Marshmallow");
        Candy c4 = new Candy("Hot");
        Candy c5 = new Candy("Ym");
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);


        Child ch1 = new Child(new ChooseOnlySugarFreeStrategy(),10);
        Candy choice = ch1.chooseCandy(list);
        System.out.println(choice.getType());

        Child ch2 = new Child(new CandyHaterStrategy(),5);
        Candy choice2 = ch2.chooseCandy(list);
        System.out.println(choice2.getType());

        Child ch3 = new Child(new MakeChoiceDependingOnAgeStrategy(),7);
        Candy choice3 = ch3.chooseCandy(list);
        System.out.println(choice3.getType());

    }
}
