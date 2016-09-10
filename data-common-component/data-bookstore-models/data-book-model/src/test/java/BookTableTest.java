package com.mkcoder.mycodingblog.largebookstore.database.table.column;

import com.mkcoder.mycodingblog.largebookstore.builder.BookBuilder;
import com.mkcoder.mycodingblog.largebookstore.model.Book;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Iterator;

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
        Iterator<String> it =  bookTable.iterator();
        for (int i = 0; i < columnName.length; i++) {
            String next = it.next();
            if ( next == null ) break;
            assertEquals("Book iterable works", columnName[i], next);
        }
    }


}
