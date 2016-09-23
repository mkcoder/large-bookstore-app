package com.mkcoder.mycodingblog.largebookstore.properties.data;

import com.mkcoder.mycodingblog.largebookstore.configurations.DatabaseConfigurePropertyLoader;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Objects;


/**
 * Loads the jdbc drive, user name and jdbcPassword and returns this property
 */
@Named
public class JdbcPropertyLoader {

    private DatabaseConfigurePropertyLoader databaseConfigurePropertyLoader;

    @Inject
    public JdbcPropertyLoader(DatabaseConfigurePropertyLoader databaseConfigurePropertyLoader) {
        Objects.requireNonNull(databaseConfigurePropertyLoader, "DatabaseConfigurePropertyLoader cam't be null");
        this.databaseConfigurePropertyLoader = databaseConfigurePropertyLoader;
    }

    public String getJdbcUrl() {
        return databaseConfigurePropertyLoader.jdbcUrl();
    }

    public String getJdbcPassword() {
        return databaseConfigurePropertyLoader.jdbcPassword();
    }

    public String getJdbcUsername() {
        return databaseConfigurePropertyLoader.jdbcUsername();
    }

    public String getJdbcDriver() {
        return databaseConfigurePropertyLoader.jdbcDriver();
    }
}
