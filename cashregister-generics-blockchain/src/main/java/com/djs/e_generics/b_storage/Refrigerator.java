package com.djs.e_generics.b_storage;

public class Refrigerator implements Item{

    private double price = 400;
    private String description = "I am a refigerator";

    @Override
    public String toString() {
        return "Refrigerator{" +
                "price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public double getPrice() {
        return price;
    }
}
