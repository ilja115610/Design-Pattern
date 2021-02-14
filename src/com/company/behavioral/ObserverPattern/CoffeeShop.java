package com.company.behavioral.ObserverPattern;

public class CoffeeShop {

    public static void main(String[] args) {

        WaitingCustomer c1 = new Customer("Kolja", "mahito");
        WaitingCustomer c2 = new Customer("Vasja", "vodka");
        WaitingCustomer c3 = new Customer("Petja", "pivas");

        CoffeeAttendant a1 = new CoffeeAttendant();

        a1.takeOrder(c1);
        a1.takeOrder(c2);
        a1.takeOrder(c3);

        a1.prepareDrink(c1.getDrinkOrder());
        a1.prepareDrink(c2.getDrinkOrder());
        a1.prepareDrink(c3.getDrinkOrder());

        a1.CallOutCompletedOrder();


    }
}
