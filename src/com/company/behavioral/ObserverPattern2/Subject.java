package com.company.behavioral.ObserverPattern2;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observerList = new ArrayList<>();

    private int value;


    public int getValue() {
        return value;
    }

    public void addObserver (Observer observer) {

        observerList.add(observer);
    }

    private void updateObservers (int currentValue, int newValue) {

        for(Observer obs: observerList){
            obs.getUpdate(currentValue,newValue);
        }
    }

    public void changeValue (int newValue) {

        this.value = newValue;

        updateObservers(this.value,newValue);
    }

}
