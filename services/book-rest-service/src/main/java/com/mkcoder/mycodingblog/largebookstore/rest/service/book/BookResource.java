package com.mkcoder.mycodingblog.largebookstore.rest.service.book;

import com.mkcoder.mycodingblog.largebookstore.model.Book;
import com.mkcoder.mycodingblog.largebookstore.repository.book.BasicBookRetrievalRepository;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.criteria.CriteriaQuery;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
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
    @Path("/all")
    @Produces("application/json")
    public List<Book> getAllBooks() {
        return bookRetrievalRepository.getAll();
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Book getBookById(@PathParam("id") int id) {
        return bookRetrievalRepository.find(id);
    }

    @GET
    @Path("/{CriteriaModel}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<Book> getAllByCriteria(BookCriteraModel CriteriaModel) {
        CriteriaQuery<BookCriteraModel> criteriaQuery;
        return null;
    }
}
