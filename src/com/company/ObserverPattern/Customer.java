package com.company.ObserverPattern;

public class Customer implements WaitingCustomer {

   public String name;
   public String drinkOrdered;


    @Override
    public void orderReady(String preparedDrink) {
        if (preparedDrink.equals(drinkOrdered)) {
            System.out.println(preparedDrink + " received, Thank you! ");
        }
        else
            System.out.println("Not mine!");
    }

    public Customer(String name, String drinkOrdered) {
        this.name = name;
        this.drinkOrdered = drinkOrdered;
    }

    @Override
    public void getName() {
        System.out.println(name + "!!!");
    }

    @Override
    public String getDrinkOrder() {
        return drinkOrdered;
    }
}
