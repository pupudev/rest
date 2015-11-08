package com.fran.resources;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("rest")
public class ResourcesConfiguration extends ResourceConfig {
	public ResourcesConfiguration() {
		packages("com.fran.resources");
		register(JacksonFeature.class);
		register(com.fran.providers.MyJacksonProvider.class);
		register(com.fran.resources.PersonDataResource.class);

		System.out.println("REST configuration ended successfully.");
	}
}
