package com.djs.e_generics.a_user;

import java.util.HashMap;
import java.util.Map;

public class UserMapStorage<T, U> {

    Map<T, U> users = new HashMap<>();

    public void addUser( T t, U u){
        users.put( t, u);
    }

    public U getUser( T t){
        return users.get(t);
    }
}
