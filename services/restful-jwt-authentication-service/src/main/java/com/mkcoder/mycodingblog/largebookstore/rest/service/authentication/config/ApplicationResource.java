package com.mkcoder.mycodingblog.largebookstore.rest.service.authentication.config;

import com.mkcoder.mycodingblog.largebookstore.rest.service.authentication.resource.BasicLoginResource;
import org.glassfish.jersey.server.ResourceConfig;

public class ApplicationResource extends ResourceConfig {

    public ApplicationResource() {
        System.out.println("AuthenticateResouces.ApplicationResource called");
        register(BasicLoginResource.class);
    }
}