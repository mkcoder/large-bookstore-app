package com.mkcoder.mycodingblog.data.properties;

import com.mkcoder.mycodingblog.configurations.DatabaseConfigurePropertyLoader;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Objects;


/**
 * Loads the jdbc drive, user name and jdbcPassword and returns this property
 */
@Named
public class JdbcPropertyLoader {

    private DatabaseConfigurePropertyLoader databaseProps;

    @Inject
    public JdbcPropertyLoader(DatabaseConfigurePropertyLoader databaseProps) {
        Objects.requireNonNull(databaseProps, "DatabaseConfigurePropertyLoader cam't be null");
        this.databaseProps = databaseProps;
    }

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
