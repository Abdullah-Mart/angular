package com.djs.d_factory;

import java.util.Optional;

public class Starter {

    public static void main(String[] args) {

        Optional<DataSource> oracleDataSource =
                DataSourceFactory.createDataSource( DataSourceType.ORACLE);

        if(oracleDataSource.isPresent()){
            System.out.println(oracleDataSource.get().createSql());
        }

        Optional<DataSource> mySqlDataSource =
                DataSourceFactory.createDataSource( DataSourceType.MYSQL);

        if(mySqlDataSource.isPresent()){
            System.out.println(mySqlDataSource.get().createSql());
            System.out.println(((MySqlDataSource)mySqlDataSource.get()).getInfo());
        }

        Optional<DataSource> dynamoDbDataSource = DataSourceFactory.createDataSource(DataSourceType.DYNAMODB);

        if (dynamoDbDataSource.isPresent()){
            System.out.println( dynamoDbDataSource.get().createSql());
        }

        Optional<DataSource> sqlServerDataSource = DataSourceFactory.createDataSource(DataSourceType.SQLSERVER);

        if (sqlServerDataSource.isPresent()){
            System.out.println( sqlServerDataSource.get().createSql());
        }
    }
}
