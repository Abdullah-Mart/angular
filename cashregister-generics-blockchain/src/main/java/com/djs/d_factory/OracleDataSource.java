package com.djs.d_factory;

public class OracleDataSource implements DataSource{

    @Override
    public String createSql() {
        return "Select * from Oracle database";
    }
}
