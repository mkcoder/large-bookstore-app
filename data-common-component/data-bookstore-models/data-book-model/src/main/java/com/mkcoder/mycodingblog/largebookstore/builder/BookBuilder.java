package com.mkcoder.mycodingblog.largebookstore.builder;

import com.mkcoder.mycodingblog.largebookstore.builder.service.Builder;
import com.mkcoder.mycodingblog.largebookstore.model.Book;

/**
 * builds a book with the property set
 */
public final class BookBuilder implements Builder<Book> {


    public String description;
    public String price;
    public String author;
    public String title;
    public int id;

    public BookBuilder description(String description) {
        this.description = description;
        return this;
    }

    public BookBuilder price(String price) {
        this.price = price;
        return this;
    }

    public BookBuilder author(String author) {
        this.author = author;
        return this;
    }

    public BookBuilder title(String title) {
        this.title = title;
        return this;
    }

    public BookBuilder id(int id) {
        this.id = id;
        return this;
    }

    public Book build() {
        return new Book(this);
    }
}
