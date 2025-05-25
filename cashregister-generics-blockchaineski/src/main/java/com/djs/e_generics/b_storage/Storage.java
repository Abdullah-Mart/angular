package com.djs.e_generics.b_storage;

import java.util.ArrayList;
import java.util.List;

public class Storage <T>{

    private List<T> items = new ArrayList<>();

    public void addItem( T t){
        items.add(t);
    }

    public T getLastItem(){

        if( items.size() == 0){
            return null;
        }

        return items.get(items.size() -1);
    }
}
