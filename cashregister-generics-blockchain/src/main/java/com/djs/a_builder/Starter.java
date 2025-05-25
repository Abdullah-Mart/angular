package com.djs.a_builder;

public class Starter {

    public static void main(String[] args) {

        User user = User.builder(1)
                .withName("John")
                .withAge(25)
                .withCity("New York")
                .withEmail("john@server.org")
                .build();

        User user2 = User.builder(2)
                .withName("John")
                .withAge(25)
                .withCity("New York")
                .withEmail("john@server.org")
                .build();

        System.out.println(user);
        System.out.println(user2);
    }
}
