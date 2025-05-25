package com.djs.a_builder;

public class User {

    private long id;
    private String name;
    private int age;
    private String city;
    private String email;

    private User(){
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static Builder builder(long id){
        return new Builder(id);
    }

    static class Builder{

        private long id;
        private String name;
        private int age;
        private String city;
        private String email;

        public Builder( long id){
            this.id = id;
        }

        public Builder withName(String name){
            this.name = name;
            return this;
        }

        public Builder withAge(int age){
            this.age = age;
            return this;
        }

        public Builder withCity(String city){
            this.city = city;
            return this;
        }

        public Builder withEmail(String email){
            this.email = email;
            return this;
        }

        public User build(){
            User user = new User();
            user.id = this.id;
            user.name = this.name;
            user.age = this.age;
            user.city = this.city;
            user.email = this.email;
            return user;
        }
    }
}
