package com.company.behavioral.ObserverPattern2;

public class ByTenChangedObserver extends Observer{


    public ByTenChangedObserver(Subject observable) {
        super(observable);

    }


    @Override
    public void getUpdate(int currentValue, int newValue) {

        if(Math.abs(currentValue-newValue)>=10){
            System.out.println("Value changed more than 10 units: "+newValue);
            }
    }
}
