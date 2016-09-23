package com.mkcoder.mycodingblog.largebookstore.properties.data;

import org.apache.commons.dbcp2.BasicDataSource;

import java.util.Objects;

/**
 * a pojo for the database source
 */
public class DataSource {

    private BasicDataSource dataSource;

    public DataSource(BasicDataSource dataSource) {
        Objects.requireNonNull(dataSource, "BasicDataSource is a required field");
        this.dataSource = dataSource;
    }

    public BasicDataSource getDataSource() {
        return dataSource;
    }

    public DataSource setDataSource(BasicDataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }
}
