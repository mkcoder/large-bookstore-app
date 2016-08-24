package com.mkcoder.mycodingblog.doa;

import com.mkcoder.mycodingblog.data.properties.DataSource;
import com.mkcoder.mycodingblog.largebookstore.model.Book;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.List;

/**
 * this is a very basic doa for getting all the books from the database
 */
@Component
public class BookDoaImpl {

    private static JdbcTemplate jdbcTemplate;
    private BasicDataSource dataSource;

    public BookDoaImpl(BasicDataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
}
