package com.mkcoder.mycodingblog.largebookstore.rest.service.book;

import com.mkcoder.mycodingblog.largebookstore.model.Book;
import com.mkcoder.mycodingblog.largebookstore.repository.book.BasicBookRetrievalRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.criteria.CriteriaQuery;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
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
    @CrossOrigin(origins = "*")
    public Response getAllBooks() {
        return Response.ok()
                .entity(bookRetrievalRepository.getAll())
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
                .allow("OPTIONS").build();
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
