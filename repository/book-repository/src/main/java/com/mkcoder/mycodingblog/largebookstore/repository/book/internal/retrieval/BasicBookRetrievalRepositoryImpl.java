package com.mkcoder.mycodingblog.largebookstore.repository.book.internal.retrieval;

import com.mkcoder.mycodingblog.largebookstore.configurations.DatabaseConfigurePropertyLoader;
import com.mkcoder.mycodingblog.largebookstore.model.Book;
import com.mkcoder.mycodingblog.largebookstore.repository.book.BasicBookRetrievalRepository;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;
import java.util.Objects;

public class BasicBookRetrievalRepositoryImpl implements BasicBookRetrievalRepository {

    @PersistenceContext
    private EntityManager manager;
    private CriteriaBuilder cb;
    private DatabaseConfigurePropertyLoader databaseConfigurePropertyLoader;

    @Inject
    public BasicBookRetrievalRepositoryImpl(DatabaseConfigurePropertyLoader databaseConfigurePropertyLoader) {
        this.databaseConfigurePropertyLoader = Objects.requireNonNull(databaseConfigurePropertyLoader);
    }

    @Override
    public List<Book> getAll() {
        CriteriaQuery<Book> query = cb.createQuery(Book.class);
        CriteriaQuery<Book> bookQuery = query.select(query.from(Book.class));
        return manager.createQuery(bookQuery).getResultList();
    }

    @Override
    public Book find(int id) {
        return manager.find(Book.class, id);
    }

    @Override
    public List<Book> find(CriteriaQuery criteria) {
        return manager.createQuery(criteria).getResultList();
    }
}
