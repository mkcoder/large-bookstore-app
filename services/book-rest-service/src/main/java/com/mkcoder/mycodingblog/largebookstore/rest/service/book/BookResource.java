package com.mkcoder.mycodingblog.largebookstore.rest.service.book;

import com.mkcoder.mycodingblog.largebookstore.model.Book;
import com.mkcoder.mycodingblog.largebookstore.repository.book.BasicBookRetrievalRepository;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;
import java.util.Objects;

@Path("book")
@Named
public class BookResource {

    private BasicBookRetrievalRepository bookRetrievalRepository;

    @Inject
    public BookResource(BasicBookRetrievalRepository bookRetrievalRepository) {
        Objects.requireNonNull(bookRetrievalRepository, "BasicBookRetrievalRepository can't be null");
        this.bookRetrievalRepository = bookRetrievalRepository;
    }

    @GET
    @Produces("application/json")
    public List<Book> getAllBooks() {
        return bookRetrievalRepository.getAll();
    }
}
