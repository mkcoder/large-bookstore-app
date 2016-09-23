package com.mkcoder.mycodingblog.largebookstore.repository.book.internal.retrieval;

import com.mkcoder.mycodingblog.largebookstore.model.Book;
import com.mkcoder.mycodingblog.largebookstore.repository.book.BasicBookRetrievalService;
import org.jvnet.hk2.annotations.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Service
public class BasicBookRetrievalServiceImpl implements BasicBookRetrievalService {

    private EntityManagerFactory emFactory;
    private EntityManager manager;
    private CriteriaBuilder cb;

    public BasicBookRetrievalServiceImpl() {
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
