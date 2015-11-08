package com.fran.resources;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("HelloJson")
public class HelloJson {
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response helloJsonResource(InputStream inputStream) {
		StringBuilder stringBuilder = new StringBuilder();
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				stringBuilder.append(line);
			}
		} catch (Exception e) {
			System.out.println("Error parsin: -");
		}
		System.out.println("Data received: " + stringBuilder.toString());
		
		return Response.status(200).entity(stringBuilder.toString()).build();
	}
}
