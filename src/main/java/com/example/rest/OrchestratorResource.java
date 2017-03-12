package com.example.rest;

import org.glassfish.jersey.jackson.JacksonFeature;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * 
 * @author millanes
 *
 */
@Path("/orchestrator")
public class OrchestratorResource {

	@GET
	@Produces("application/json")
	public TypiCode[] get() {
		Client client = ClientBuilder.newClient().register(new JacksonFeature());
		List<TypiCode> typiCodeList = client.target("http://web-alias-todos:8080/todos").request(MediaType.APPLICATION_JSON)
				.get(new GenericType<List<TypiCode>>() {
				});

		List<Employee> employeesList=client.target("http://web-alias-employee:8080/employee").request(MediaType.APPLICATION_JSON)
				.get(new GenericType<List<Employee>>() {
				});
		for(TypiCode item: typiCodeList) {
			item.setEmployeeList(employeesList);
			System.out.println(item.getTitle());
			System.out.println(item);

			 
			}
		return typiCodeList.toArray(new TypiCode[0]);

	}



}