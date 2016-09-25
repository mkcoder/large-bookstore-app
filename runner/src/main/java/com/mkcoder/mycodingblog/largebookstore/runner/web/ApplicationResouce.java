package com.mkcoder.mycodingblog.largebookstore.runner.web;

import org.glassfish.jersey.server.ResourceConfig;

public class ApplicationResouce extends ResourceConfig {

    /**
     * Register JAX-RS application components.
     */
    public ApplicationResouce() {
        System.out.println("CALLED APPLCATION IN RUNNER");
        packages("com.mkcoder.mycodingblog.largebookstore.rest.service");

    }
}