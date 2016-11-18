package com.alfasoft.boe.resources;

import javax.ws.rs.BeanParam;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import com.alfasoft.boe.bean.FiltriFattura;

@Path("test")
public class TestApi {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String metodoProva() {
		return "Ciao";
	}
	
	//metodo per prendere parametri passati dentro l'header
	@Path("/header")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getHeaderParameter(@HeaderParam("num") int num) {
		return "La somma è " + (num+num);
	}
	
	//metodo per prendere parametri da cookie
	@Path("/cookie")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getCookieParameter(@CookieParam("num") int num) {
		return "La somma è " + (num+num);
	}
	
	//metodo per prendere parametri da cookie
	@Path("/context")
	@GET
	public String getContextParameter(@Context UriInfo uriInfo, @Context HttpHeaders httpHeader) {
//		return httpHeader.getCookies().toString();
		return uriInfo.getAbsolutePath().toString();
	}
	
	//metodo per prendere Bean parametri da classe
	@Path("/bean")
	@GET
	public String getBeanParameter(@BeanParam FiltriFattura ff) {
		
		return ff.getAnno()+" "+ff.getOffset()+" "+ff.getLimit();
	}
	
}
