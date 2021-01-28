package com.company;

import com.company.StrategyPattern2.Animal;
import com.company.StrategyPattern2.Cat;
import com.company.StrategyPattern2.Dog;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Dog(20.0);
        dog.makeNoise();

        Animal cat = new Cat(10.5);

        cat.makeNoise();
    }
}
