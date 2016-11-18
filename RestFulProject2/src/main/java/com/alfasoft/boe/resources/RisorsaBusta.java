package com.alfasoft.boe.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.alfasoft.dao.BustaPagaDao;
import com.alfasoft.model.BustaPaga;

@Path("/")
public class RisorsaBusta {
	
	BustaPagaDao bpd = new BustaPagaDao();
	
	@Path("/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public BustaPaga getBustaPagaId(@PathParam("id") int id){
		return bpd.getBuste().get(id);
	}
	
	@GET
	public List<BustaPaga> getAllBusta() {
		return new ArrayList<>(bpd.getBuste().values());
	}
	
}
