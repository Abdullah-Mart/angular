package com.djs.d_factory;

public class MySqlDataSource implements DataSource{

    @Override
    public String createSql() {
        return "Select * from MySql database";
    }

    public String getInfo(){
        return "Hello";
    }
}