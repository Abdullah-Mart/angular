package com.djs.e_generics.b_storage;

public class FillStorage {

    public static void main(String[] args) {

        Storage<Bicycle> bicycleStorage = new Storage<>();
        bicycleStorage.addItem( new Bicycle());

        Storage<Refrigerator> refridgeratorStorage = new Storage<>();
        refridgeratorStorage.addItem( new Refrigerator());

        Refrigerator refrigerator = refridgeratorStorage.getLastItem();


        Storage<Item>   itemStorage = new Storage<>();
        itemStorage.addItem(new Bicycle());
        itemStorage.addItem( new Refrigerator());
        Item item = itemStorage.getLastItem();

        System.out.println(item.toString() + ", price: " + item.getPrice());
    }
}
