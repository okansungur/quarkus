package org.acme;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;


import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;

@Path("/hello")
public class Hello implements QuarkusApplication {

    @ConfigProperty(name = "myhello.message")
    private String message;

    @GET
    @Produces(MediaType.TEXT_PLAIN)

    public String hello() {
        return "The message is " + message;
    }

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    public void create(String message) {
        System.out.println("created");
    }

    @PUT
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public String update(String message) {
        System.out.println("updated");
        return message;
    }

    @DELETE
    public void delete() {
        System.out.println("deleted");
    }

    @GET
    @Path("/message")
    @Produces(MediaType.TEXT_PLAIN)
    public  String  getMessage() {
          
    return "This is the message";
    
    
    }


    @Override
    public int run(String... args) throws Exception {
        System.out.println("Hello World");
        Quarkus.waitForExit();
        return 0;
    }

}