package com.djs.d_factory;

import java.util.Optional;

public class DataSourceFactory {

    public static Optional<DataSource> createDataSource(DataSourceType dataSourceType){
        switch( dataSourceType){
            case ORACLE: {
                return Optional.of(new OracleDataSource());
            }
            case MYSQL: {
                return Optional.of(new MySqlDataSource());
            }
            case DYNAMODB: {
                return Optional.of(new DynamoDbDataSource());
            }
            default:
                return null;
        }
    }
}
