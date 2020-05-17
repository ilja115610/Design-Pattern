package com.company.FactoryPattern;

public class VehicleFactory {
    Vehicle auto = null;

    public Vehicle getVehicle (VehicleType veh) {

        switch (veh) {
            case CAR:
                auto = new Car();
                break;
            case BUS:
                auto = new Bus();
                break;
            case TRUCK:
                 auto = new Truck();
                break;

        }
            return auto;
    }

    public Vehicle getAnother (VehicleType type) {
        Vehicle car = null;
        if(type==VehicleType.CAR){
            car = new Car();
        }
        return car;
    }


}
