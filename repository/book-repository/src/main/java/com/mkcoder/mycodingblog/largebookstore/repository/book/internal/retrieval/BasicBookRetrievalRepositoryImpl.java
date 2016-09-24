package com.mkcoder.mycodingblog.largebookstore.repository.book.internal.retrieval;

import com.mkcoder.mycodingblog.largebookstore.model.Book;
import com.mkcoder.mycodingblog.largebookstore.repository.book.BasicBookRetrievalRepository;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Named
public class BasicBookRetrievalRepositoryImpl implements BasicBookRetrievalRepository {

    private EntityManagerFactory emFactory;
    private EntityManager manager;
    private CriteriaBuilder cb;

    public BasicBookRetrievalRepositoryImpl() {
        emFactory = Persistence.createEntityManagerFactory("LargeBookStoreBookJPA");
        manager = emFactory.createEntityManager();
        cb = manager.getCriteriaBuilder();
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
