package com.mkcoder.mycodingblog.largebookstore.rest.service.book;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("book")
public class BookResource {
    @GET
    @Produces("text/plain")
    public String getAllBooks() {
        System.out.println("hello");
        return "i will get all the books in the future";
    }
}
