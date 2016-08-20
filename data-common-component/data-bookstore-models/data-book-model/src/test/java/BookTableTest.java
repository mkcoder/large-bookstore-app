package com.mkcoder.mycodingblog.largebookstore.database.table.column;

import com.mkcoder.mycodingblog.largebookstore.builder.BookBuilder;
import com.mkcoder.mycodingblog.largebookstore.model.Book;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

/**
 * a test for the book table iterator works
 */
public class BookTableTest {

    @Mock
    private BookBuilder mockBookBuilder;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testThatBookTableIteratorGivesMeAllTheIteratorFieldNames() {
        Book bookTable = new Book(mockBookBuilder);
        String[] columnName = {"id", "title", "author", "price", "description" };
        int index = 0;
        for (String column : bookTable) {
            assertEquals("Book iterable works", columnName[index++], column);
        }
    }


}
