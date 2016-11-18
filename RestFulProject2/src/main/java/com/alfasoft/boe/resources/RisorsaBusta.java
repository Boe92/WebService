package com.alfasoft.boe.resources;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import com.alfasoft.dao.BustaPagaDao;
import com.alfasoft.model.BustaPaga;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class RisorsaBusta {
	
	BustaPagaDao bpd = new BustaPagaDao();
	
	@Path("/{id}")
	@GET
	public BustaPaga getBustaPagaId(@PathParam("id") int id){
		return bpd.getBuste().get(id);
	}
	
	@GET
	public List<BustaPaga> getAllBusta() {
		return new ArrayList<>(bpd.getBuste().values());
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addBusta(BustaPaga b, @Context UriInfo uriInfo) {
		//Se lo passo ad un DB il campo id bustapaga deve essere vuoto
		bpd.getBuste().put(b.getId(), b);
		
		URI u = uriInfo.getAbsolutePathBuilder().path(String.valueOf(b.getId())).build();
		return Response.created(u).entity(b).build();
	}
	
}
