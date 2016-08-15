package com.mkcoder.mycodingblog.largebookstore.database.table.column;

import org.junit.Test;

/**
 * a test for the book table iterator works
 */
public class BookTableTest {

    @Test
    public void testThatBookTableIteratorGivesMeAllTheIteratorFieldNames() {
        BookTable bookTable = new BookTable();
        for (String column : bookTable) {
            System.out.println(column);
        }
    }


}
