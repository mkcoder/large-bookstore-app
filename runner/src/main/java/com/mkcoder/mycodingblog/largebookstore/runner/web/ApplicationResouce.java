package com.mkcoder.mycodingblog.largebookstore.runner.web;

import com.mkcoder.mycodingblog.largebookstore.rest.service.book.BookResource;
import org.glassfish.jersey.server.ResourceConfig;

public class ApplicationResouce extends ResourceConfig {

    /**
     * Register JAX-RS application components.
     */
    public ApplicationResouce() {
        System.out.println("CALLED APPLCATION IN RUNNER");
        register(BookResource.class);
    }
}