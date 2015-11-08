package com.fran.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("HelloRest")
public class HelloRestResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String helloRestResource() {
		return "Hello REST!";
	}
}
