
package com.mkcoder.mycodingblog.largebookstore.rest.service.book;

import com.mkcoder.mycodingblog.largebookstore.model.Book;
import org.glassfish.jersey.server.ResourceConfig;

public class ApplicationResource extends ResourceConfig {

    public ApplicationResource() {
        System.out.println("BookResource.ApplicationResource called");
        register(Book.class);
        register(BookResource.class);
    }
}