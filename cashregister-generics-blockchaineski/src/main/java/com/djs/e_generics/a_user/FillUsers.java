package com.djs.e_generics.a_user;

public class FillUsers {

    public static void main(String[] args) {





        User user = new User( 123456, "John", "john@s.org");
        UserListStorage<User> userUserListStorage = new UserListStorage<>();
        userUserListStorage.addUser( user);





        UserMapStorage< Long, User> userStorageById = new UserMapStorage<>();
        // Add user to storage by id
        userStorageById.addUser( user.getId(), user);
        User idUser = userStorageById.getUser( user.getId());
        System.out.println( idUser);

        UserMapStorage< String, User> userStorageByEmail = new UserMapStorage<>();
        // Add user to storage by email
        userStorageByEmail.addUser( user.getEmail(), user);
        userStorageByEmail.getUser(user.getEmail());
        User emailUser = userStorageByEmail.getUser( user.getEmail());
        System.out.println( emailUser);
    }
}
