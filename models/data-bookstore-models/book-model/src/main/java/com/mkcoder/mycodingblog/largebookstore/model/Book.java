package com.mkcoder.mycodingblog.largebookstore.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mkcoder.mycodingblog.largebookstore.builder.BookBuilder;
import com.mkcoder.mycodingblog.largebookstore.database.table.AbstractDatabaseTable;

import javax.persistence.*;
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
@Entity
@Table(name="book")
public class Book extends AbstractDatabaseTable {

    private int id;
    private String title;
    private String author;
    private String price;
    private String description;

    public Book() {
    }

    public Book(BookBuilder builder) {
        this.id = builder.id;
        this.title = builder.title;
        this.author = builder.author;
        this.price = builder.price;
        this.description = builder.description;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "price")
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book that = (Book) o;

        if (id != that.id) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @SuppressWarnings("JpaAttributeTypeInspection")
    @Override
    @JsonIgnore
    public Field[] getFields() {
        return this.getClass().getDeclaredFields();
    }
}
