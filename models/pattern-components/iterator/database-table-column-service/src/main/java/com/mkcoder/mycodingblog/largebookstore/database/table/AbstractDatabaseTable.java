package com.mkcoder.mycodingblog.largebookstore.database.table;

import java.lang.reflect.Field;
import java.util.Iterator;

/**
 * Every database table must implement this database table
 */
public abstract class AbstractDatabaseTable implements Iterable<String> {

    public abstract Field[] getFields();

    public Iterator<String> iterator() {
        return new Iterator<String>() {
            final Field[] fields = getFields();
            int index = 0;
            public boolean hasNext() {
                return index != fields.length;
            }

            public String next() {
                return fields[index++].getName();
            }
        };
    }

}
