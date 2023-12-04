package com.dknsf;

import io.quarkus.cache.CacheResult;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @CacheResult(cacheName = "hello-cache")
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }
}
