package com.djs.e_generics.a_user;

import java.util.ArrayList;
import java.util.List;

public class UserListStorage <T>{

    private List<T> users = new ArrayList<>();

    public void addUser( T t){
        users.add( t);
    }

    public T getUser(){
        return users.get(users.size() - 1);

    }

}
