package com.mkcoder.mycodingblog.largebookstore.model;

import com.mkcoder.mycodingblog.largebookstore.builder.BookBuilder;
import com.mkcoder.mycodingblog.largebookstore.database.table.AbstractDatabaseTable;

import java.lang.reflect.Field;

/**
 * A book model to represent a book
 * ------------------
 * |     Book        |
 * ------------------
 * id int(11) AI PK
 * title text
 * author varchar(255)
 * price text
 * description text
 */
public class Book extends AbstractDatabaseTable {

    private int id;
    private String title;
    private String author;
    private String price;
    private String description;

    public Book(BookBuilder builder) {
        this.id = builder.id;
        this.title = builder.title;
        this.author = builder.author;
        this.price = builder.price;
        this.description = builder.description;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public Field[] getFields() {
        return this.getClass().getDeclaredFields();
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
