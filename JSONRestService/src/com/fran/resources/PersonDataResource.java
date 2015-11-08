package com.fran.resources;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fran.model.Person;

@Path("ProcessPerson")
public class PersonDataResource {
	
	@Path("get")
	@GET
    @Produces({MediaType.APPLICATION_JSON})
	public Person getPerson() {
		Person p = new Person();
		p.setFirstName("Jack");
		p.setLastName("Sparrow");
		//p.setDateOfBirth("01.01.1988");
		
		p.setCitizenships(new String[]{"English", "Spanish"});
		
		Map<String, Object> creditCards = new HashMap<String, Object>();
		creditCards.put("MasterCard", "1234 1234 1234 1234");
		creditCards.put("Visa", "1234 1234 1234 1234");
		p.setCreditCards(creditCards);
		
		System.out.println("REST call...");
		
		return p;
	}
	
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.TEXT_PLAIN})
	@Path("/post")
	public String postPerson(Person p) throws Exception {
		
		System.out.println("First Name = " + p.getFirstName());
		System.out.println("Last Name = " + p.getLastName());
		
		return "OK";
	}
}
