package org.javaturk.ws.greeting.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/restful")
public class GreetingRestfulService {
	private static String xmlResponse = "<string>Hello :)</string>";
	private static String jsonResponse = "{\"response\":\"Hello :)\"}";

    @GET
    @Path("/greet.xml")
//    @Produces(MediaType.APPLICATION_XML)
    public String getGreetingXML() {
    	return xmlResponse;
    }
    
    @GET
    @Path("/greet.json")
//    @Produces(MediaType.APPLICATION_JSON)
    public String getGreetingJSON() {
    	return jsonResponse;
    }
}
