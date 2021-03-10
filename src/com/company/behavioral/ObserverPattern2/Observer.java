package com.company.behavioral.ObserverPattern2;

public abstract class Observer {

    protected Subject observable;

    public Observer(Subject observable) {
        this.observable = observable;
        observable.addObserver(this);
    }



    public abstract void getUpdate(int currentValue, int newValue);
}
