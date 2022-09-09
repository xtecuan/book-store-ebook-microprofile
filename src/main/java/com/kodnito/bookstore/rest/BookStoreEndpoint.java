package com.kodnito.bookstore.rest;

import com.kodnito.bookstore.entity.Book;
import com.kodnito.bookstore.service.BookService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RequestScoped
@Path("books")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BookStoreEndpoint {
    @Inject
    BookService bookService;
    @GET
    public Response getAll() {
        return Response.ok(bookService.getAll()).build();
    }
    @GET
    @Path("{id}")
    public Response getBook(@PathParam("id") Long id) {
        Book book = bookService.findById(id);
        return Response.ok(book).build();
    }

    @POST
    public Response create(Book book) {
        bookService.create(book);
        return Response.ok().build();
    }
}
