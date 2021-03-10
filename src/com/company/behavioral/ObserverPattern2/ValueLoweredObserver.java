package com.company.behavioral.ObserverPattern2;

public class ValueLoweredObserver extends Observer {


    public ValueLoweredObserver(Subject observable) {
        super(observable);

    }


    @Override
    public void getUpdate(int currentValue, int newValue) {

        if(currentValue>newValue){
            System.out.println("Value lowered: "+newValue);
        }
    }


}