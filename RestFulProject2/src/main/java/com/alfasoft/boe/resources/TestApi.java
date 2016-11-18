package com.alfasoft.boe.resources;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("test")
public class TestApi {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String metodoProva() {
		return "Ciao";
	}
	
	@Path("/header")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getHeaderParameter(@HeaderParam("num") int num) {
		return "La somma è " + (num+num);
	}
}
