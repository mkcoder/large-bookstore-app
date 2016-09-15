package com.mkcoder.mycodingblog.largebookstore.repository.book.internal.retrieval;

import com.mkcoder.mycodingblog.largebookstore.data.properties.JdbcPropertyLoader;
import com.mkcoder.mycodingblog.largebookstore.model.Book;
import com.mkcoder.mycodingblog.largebookstore.repository.book.BasicBookRetrievalService;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.sql.DataSource;
import java.util.List;
import java.util.Objects;

public class BasicBookRetrievalServiceImpl implements BasicBookRetrievalService {

    private JdbcPropertyLoader jdbcPropertyLoader;
    private EntityManagerFactory emFactory;
    private EntityManager manager;
    private CriteriaBuilder cb;
    private LocalContainerEntityManagerFactoryBean factoryBean;

    public BasicBookRetrievalServiceImpl() {
        factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setDataSource(getDataSource());
        factoryBean.setPersistenceUnitName("LargeBookStoreBookJPA");
        emFactory = factoryBean.getNativeEntityManagerFactory();
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

    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(jdbcPropertyLoader.getJdbcDriver());
        dataSource.setUrl(jdbcPropertyLoader.getJdbcUrl());
        dataSource.setUsername(jdbcPropertyLoader.getJdbcUsername());
        dataSource.setPassword(jdbcPropertyLoader.getJdbcPassword());
        return dataSource;
    }

    public void setJdbcPropertyLoader(JdbcPropertyLoader jdbcPropertyLoader) {
        Objects.requireNonNull(jdbcPropertyLoader, "DatabaseConfigurePropertyLoader is required");
        this.jdbcPropertyLoader = jdbcPropertyLoader;
    }
}
