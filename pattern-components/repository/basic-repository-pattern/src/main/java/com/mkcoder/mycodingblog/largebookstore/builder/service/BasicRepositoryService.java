package com.mkcoder.mycodingblog.largebookstore.builder.service;

import com.mkcoder.mycodingblog.largebookstore.database.table.AbstractDatabaseTable;

import java.util.List;
import java.util.function.Predicate;

/**
 * A basic repository that a
 */
public interface BasicRepositoryService<Model extends AbstractDatabaseTable> {

    List<Model> getAll();

    List<Model> select(Predicate predicate);

    List<Model> selectBy(String fieldName);

}
