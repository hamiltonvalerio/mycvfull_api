package br.eti.valerio.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.quarkus.security.Authenticated;

@Path("/hello")
@Authenticated
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ApiResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/oi")
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }
}