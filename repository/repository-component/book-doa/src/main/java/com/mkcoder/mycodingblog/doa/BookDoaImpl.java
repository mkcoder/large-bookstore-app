package com.mkcoder.mycodingblog.doa;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * this is a very basic doa for getting all the books from the database
 */
@Component
@Deprecated
public class BookDoaImpl {

    private static JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
}
