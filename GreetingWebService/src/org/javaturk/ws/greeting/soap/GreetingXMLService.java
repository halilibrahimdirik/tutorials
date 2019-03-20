package org.javaturk.ws.greeting.soap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/soap")
public class GreetingXMLService {
	
    @GET
    @Path("/user.xml")
    @Produces(MediaType.APPLICATION_XML)
    public String getGreeting() {

        return "Hello :)";
    }
}
