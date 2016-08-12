package com.mkcoder.mycodingblog.data.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * Loads the jdbc drive, user name and jdbcPassword and returns this property
 */
@Component
public class JdbcPropertyLoader {

    @Value("${jdbc.url}")
    private String jdbcUrl;
    @Value("${jdbc.password}")
    private String jdbcPassword;
    @Value("${jdbc.username}")
    private String jdbcUsername;

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public String getJdbcPassword() {
        return jdbcPassword;
    }

    public String getJdbcUsername() {
        return jdbcUsername;
    }
}
