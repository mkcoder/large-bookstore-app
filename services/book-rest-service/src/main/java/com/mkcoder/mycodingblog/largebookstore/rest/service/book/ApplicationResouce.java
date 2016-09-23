package com.mkcoder.mycodingblog.largebookstore.rest.service.book;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class ApplicationResouce extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        System.out.println("CALLED!");
        Set<Class<?>> s = new HashSet<Class<?>>();
        s.add(BookResource.class);
        return s;
    }
}