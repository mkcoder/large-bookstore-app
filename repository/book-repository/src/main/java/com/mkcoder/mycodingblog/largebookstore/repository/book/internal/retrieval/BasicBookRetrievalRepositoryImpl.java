package com.mkcoder.mycodingblog.largebookstore.repository.book.internal.retrieval;

import com.mkcoder.mycodingblog.largebookstore.configurations.DatabaseConfigurePropertyLoader;
import com.mkcoder.mycodingblog.largebookstore.model.Book;
import com.mkcoder.mycodingblog.largebookstore.repository.book.BasicBookRetrievalRepository;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;
import java.util.Objects;

@Named
public class BasicBookRetrievalRepositoryImpl implements BasicBookRetrievalRepository {


    private EntityManager entityManager;
    private EntityManagerFactory entityManagerFactory;
    private CriteriaBuilder cb;
    private DatabaseConfigurePropertyLoader databaseConfigurePropertyLoader;

    @Inject
    public BasicBookRetrievalRepositoryImpl(DatabaseConfigurePropertyLoader databaseConfigurePropertyLoader, EntityManagerFactory entityManagerFactory) {
        this.databaseConfigurePropertyLoader = Objects.requireNonNull(databaseConfigurePropertyLoader);
        this.entityManagerFactory = entityManagerFactory;
        this.entityManager = entityManagerFactory.createEntityManager();
        cb = entityManager.getCriteriaBuilder();
    }

    @Override
    public List<Book> getAll() {
        CriteriaQuery<Book> query = cb.createQuery(Book.class);
        CriteriaQuery<Book> bookQuery = query.select(query.from(Book.class));
        return entityManager.createQuery(bookQuery).getResultList();
    }

    @Override
    public Book find(int id) {
        return entityManager.find(Book.class, id);
    }

    @Override
    public List<Book> find(CriteriaQuery criteria) {
        return entityManager.createQuery(criteria).getResultList();
    }
}
