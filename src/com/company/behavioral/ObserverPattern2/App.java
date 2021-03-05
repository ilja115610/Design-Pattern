package com.company.behavioral.ObserverPattern2;

public class App {

    public static void main(String[] args) {

        Subject subject = new Subject();

        Observer obs1 = new ConcreteValueObserver(subject);
        Observer obs2 = new ValueLoweredObserver(subject);
        Observer obs3 = new ByTenChangedObserver(subject);

        subject.changeValue(10);

        subject.changeValue(25);
        subject.changeValue(20);






    }
}
