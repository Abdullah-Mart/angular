package com.djs.e_generics.b_storage;

public class Bicycle implements Item{

    private double price = 100;
    private String description = "I am a Bicycle";


    @Override
    public String toString() {
        return "Bicycle{" +
                "price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public double getPrice() {
        return price;
    }
}
