package com.mkcoder.mycodingblog.largebookstore.repository.book;

import com.mkcoder.mycodingblog.largebookstore.model.Book;

import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

/**
 * Created by muhammadk on 13-Sep-16.
 */
public interface BasicBookRetrievalService {
    List<Book> getAll();

    Book find(int id);

    List<Book> find(CriteriaQuery criteria);
}
