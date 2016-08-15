package com.mkcoder.mycodingblog.largebookstore.database.table.column;

import com.mkcoder.mycodingblog.largebookstore.database.table.DatabaseTable;
import com.mkcoder.mycodingblog.largebookstore.model.Book;
import javafx.scene.control.TableColumn;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by muhammadk on 14-Aug-16.
 */
public class BookTable extends DatabaseTable<String> {

    public Iterator<String> iterator() {
        return new Iterator<String>() {
            final Field[] fields = Book.class.getDeclaredFields();
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
