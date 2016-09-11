package com.mkcoder.mycodingblog.largebookstore.builder.service;

/**
 * a generic visitor that visitor classes must implement
 */
public interface Visitor<T extends Visitor> {

    void accept(T visitor);

}
