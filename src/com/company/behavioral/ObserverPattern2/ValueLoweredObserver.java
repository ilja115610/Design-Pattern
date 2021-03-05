package com.company.behavioral.ObserverPattern2;

public class ValueLoweredObserver extends Observer {


    public ValueLoweredObserver(Subject observable) {
        super(observable);
        subscribe();
    }

    @Override
    public void subscribe() {
        this.observable.addObserver(this);
    }

    @Override
    public void getUpdate(int currentValue, int newValue) {

        if(currentValue>newValue){
            System.out.println("Value lowered: "+newValue);
        }
    }


}