package com.library.rest;

import com.library.domain.Book;
import com.library.service.BookService;
import org.apache.cxf.jaxrs.impl.ResponseBuilderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Implementation of book REST resource
 */
@Component
@Path("/books")
@Produces({MediaType.APPLICATION_JSON})
public class BookResource {

    @Autowired
    private BookService bookService;

    @GET
    @Path("/")
    public Response getBook(@PathParam("id") Long bookId) {
        Response.ResponseBuilder responseBuilder = new ResponseBuilderImpl();

        Book bookEntity = bookService.read(bookId);

        responseBuilder.entity(bookEntity);
        responseBuilder.status(Response.Status.OK);
        return responseBuilder.build();
    }
}
