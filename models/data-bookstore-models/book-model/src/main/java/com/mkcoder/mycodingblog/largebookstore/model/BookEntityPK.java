package com.mkcoder.mycodingblog.largebookstore.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by muhammadk on 02-Feb-17.
 */
public class BookEntityPK implements Serializable {
    private int id;
    private int isbn;

    @Column(name = "id")
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "isbn")
    @Id
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookEntityPK that = (BookEntityPK) o;

        if (id != that.id) return false;
        if (isbn != that.isbn) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + isbn;
        return result;
    }
}
