package com.mkcoder.mycodingblog.largebookstore.repository.book;

import com.mkcoder.mycodingblog.largebookstore.model.Book;

import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

public interface BasicBookRetrievalRepository {
    List<Book> getAll();

    Book find(int id);

    List<Book> find(CriteriaQuery criteria);
}
