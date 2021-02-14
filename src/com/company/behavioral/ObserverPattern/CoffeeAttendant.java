package com.company.behavioral.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class CoffeeAttendant {

    private List<WaitingCustomer> customerList = new ArrayList<>();
    private List<String> completedDrink = new ArrayList<>();


    public void takeOrder (WaitingCustomer customer) {
        customerList.add(customer);
        System.out.println(customer.getDrinkOrder() + " is in progress ");
    }

    public void prepareDrink (String drinkToPrepare) {
        completedDrink.add(drinkToPrepare);


    }

    public void CallOutCompletedOrder () {
        for (String n : completedDrink) {
            System.out.println(n);
            for (WaitingCustomer k : customerList) {
                k.getName();
                k.orderReady(n);
            }
        }
    }


}
