package com.mkcoder.mycodingblog.data.properties;

import org.springframework.stereotype.Component;

/**
 * Loadss the jdbc drive, user name and jdbcPassword and returns this property
 */
@Component
public class PropertyLoader {

    private String jdbcUrl;
    private String jdbcPassword;
    private String jdbcUsername;

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    public String getJdbcPassword() {
        return jdbcPassword;
    }

    public void setJdbcPassword(String jdbcPassword) {
        this.jdbcPassword = jdbcPassword;
    }

    public String getJdbcUsername() {
        return jdbcUsername;
    }

    public void setJdbcUsername(String jdbcUsername) {
        this.jdbcUsername = jdbcUsername;
    }
}
