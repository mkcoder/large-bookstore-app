package com.mkcoder.mycodingblog.largebookstore.repository.book;

import com.mkcoder.mycodingblog.largebookstore.model.Book;
import org.jvnet.hk2.annotations.Contract;

import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Contract
public interface BasicBookRetrievalService {
    List<Book> getAll();

    Book find(int id);

    List<Book> find(CriteriaQuery criteria);
}
