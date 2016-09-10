package com.mkcoder.mycodingblog.data.properties;

import com.mkcoder.mycodingblog.configurations.DatabaseConfigurePropertyLoader;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Named;


/**
 * Loads the jdbc drive, user name and jdbcPassword and returns this property
 */
@Named
public class JdbcPropertyLoader {

    @Autowired
    private DatabaseConfigurePropertyLoader databaseProps;

    public String getJdbcUrl() {
        return databaseProps.jdbcUrl();
    }

    public String getJdbcPassword() {
        return databaseProps.jdbcPassword();
    }

    public String getJdbcUsername() {
        return databaseProps.jdbcUsername();
    }

    public String getJdbcDriver() {
        return databaseProps.jdbcDriver();
    }
}
