package com.mkcoder.mycodingblog.largebookstore.rest.service.book;

import com.mkcoder.mycodingblog.largebookstore.model.Book;
import org.glassfish.jersey.server.ResourceConfig;

public class ApplicationResouce extends ResourceConfig {

    public ApplicationResouce() {
        System.out.println("BookResource.ApplicationResouce called");
        register(Book.class);
        register(BookResource.class);
    }
}