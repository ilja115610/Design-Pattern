package com.company.behavioral.ObserverPattern2;

public class ConcreteValueObserver extends Observer {


    public ConcreteValueObserver(Subject observable) {
        super(observable);
        subscribe();
    }

    @Override
    public void subscribe() {
        this.observable.addObserver(this);
    }

    @Override
    public void getUpdate(int currentValue, int newValue) {
        System.out.println("Value changed to "+newValue);
    }


}
