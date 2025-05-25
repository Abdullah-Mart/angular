package com.djs.d_factory;

public class DynamoDbDataSource implements DataSource{


    @Override
    public String createSql() {
        return "Select * from DynamDb";
    }
}
