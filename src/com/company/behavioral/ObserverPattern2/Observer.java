package com.company.behavioral.ObserverPattern2;

public abstract class Observer {

    protected Subject observable;

    public Observer(Subject observable) {
        this.observable = observable;
    }

    public abstract void subscribe ();

    public abstract void getUpdate(int currentValue, int newValue);
}
