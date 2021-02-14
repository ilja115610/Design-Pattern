package com.company.creational.BuilderPattern;

public class Vehicle {

    private int price;
    private String model;
    private String make;
    private int horsePower;
    private String color;

    private Vehicle (Builder builder) {
        this.price = builder.price;
        this.color = builder.color;
        this.horsePower = builder.horsePower;
        this.make = builder.make;
        this.model = builder.model;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", horsePower=" + horsePower +
                ", color='" + color + '\'' +
                '}';
    }

    public static class Builder {

        private int price;
        private String model;
        private String make;
        private int horsePower;
        private String color;


        public Builder (String make, String model) {
            this.make = make;
            this.model = model;
        }

        public Builder price (int value) {
            this.price = value;
            return this;
        }

        public Builder horsePower (int value) {
            this.horsePower = value;
            return this;
        }

        public Builder color (String value) {
            this.color = value;
            return this;
        }

        public Vehicle build () {
            return new Vehicle(this);
        }


    }





}
