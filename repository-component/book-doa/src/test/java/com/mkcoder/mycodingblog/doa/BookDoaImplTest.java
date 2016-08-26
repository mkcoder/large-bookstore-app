package com.mkcoder.mycodingblog.doa;

import com.mkcoder.mycodingblog.data.properties.JdbcPropertyLoader;
import com.mkcoder.mycodingblog.largebookstore.builder.BookBuilder;
import com.mkcoder.mycodingblog.largebookstore.model.Book;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 
 */
public class BookDoaImplTest {

    private String path;
    private ApplicationContext context;
    private BookDoaImpl bookDoa;

    @Before
    public void setUp() throws Exception {
        path = "application-context.xml";
        context = new ClassPathXmlApplicationContext(path);
        bookDoa = context.getBean(BookDoaImpl.class);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testBookDoaImplWork() {
        assert bookDoa != null;
        List<Book> books = bookDoa.getJdbcTemplate().query("select * from book", new RowMapper<Book>() {

            public Book mapRow(ResultSet rs, int i) throws SQLException {
                BookBuilder builder = new BookBuilder();
                builder.author(rs.getString("author"));
                builder.description(rs.getString("description"));
                builder.id(rs.getInt("id"));
                builder.title(rs.getString("title"));
                builder.price(rs.getString("price"));
                return builder.build();
            }
        });

        for (Book b : books ) {
            System.out.println(b);
        }
    }
}