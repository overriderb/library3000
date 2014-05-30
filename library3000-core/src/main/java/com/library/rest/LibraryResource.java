package com.library.rest;

import com.library.domain.Library;
import com.library.service.LibraryService;
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
 * TODO: Add class description
 */
@Component
@Path("/libraries")
@Produces({MediaType.APPLICATION_JSON})
public class LibraryResource {

    @Autowired
    private LibraryService libraryService;

    @GET
    @Path("/")
    public Response getLibrary(@PathParam("id") Long libraryId) {
        Response.ResponseBuilder responseBuilder = new ResponseBuilderImpl();

        Library libraryEntity = libraryService.read(libraryId);

        responseBuilder.entity(libraryEntity);
        responseBuilder.status(Response.Status.OK);
        return responseBuilder.build();
    }
}
