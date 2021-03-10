package com.company.behavioral.ObserverPattern2;

public class ConcreteValueObserver extends Observer {


    public ConcreteValueObserver(Subject observable) {
        super(observable);

    }

    @Override
    public void getUpdate(int currentValue, int newValue) {
        System.out.println("Value changed to "+newValue);
    }


}
