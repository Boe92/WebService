package com.alfasoft.boe.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.alfasoft.dao.DipendenteDao;
import com.alfasoft.model.Dipendente;

@Path("dipendenti")
public class RisorsaDipendente {
	
	private DipendenteDao dDao = new DipendenteDao();
	

//	@Path("/{dipendente}") // si riferisce al PathParam, ovvero al parametro che stiamo passando e non come indirizzo
//	@GET
//	@Produces(MediaType.APPLICATION_XML)
//	public Dipendente getDipendenteCode(@PathParam("dipendente") String CF) {
//		return dDao.getDipendenti().get(CF);
//	}
	
//	@Path("/dipendenti")
//	@GET
//	@Produces(MediaType.APPLICATION_XML)
//	public Dipendente getDipendenteCode() {
//		return dDao.getDipendenti().get("ABC");
//	}
	
	@Path("/listaDipendenti")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Dipendente> getTuttiDipendenti() {
		return new ArrayList<Dipendente>(dDao.getDipendenti().values());
	}
	
	@Path("/listaDipendentiJson")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Dipendente> getTuttiDipendentiJson() {
		return new ArrayList<Dipendente>(dDao.getDipendenti().values());
	}
	
	@Path("/{provaJson}") // si riferisce al PathParam, ovvero al parametro che stiamo passando e non come indirizzo
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Dipendente getDipendenteCode(@PathParam("provaJson") String CF) {
		return dDao.getDipendenti().get(CF);
	}
	
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public void aggiungiDipendente(Dipendente d) {
		dDao.getDipendenti().put(d.getCF(), d);
		System.out.println(d.getNome() + " " + d.getCognome());
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public void aggiornaDipendente(Dipendente d) {
		dDao.getDipendenti().put(d.getCF(), d);
		for(Dipendente d2: dDao.getDipendenti().values()) {
			System.out.println(d2.getNome() + " " + d2.getCognome());
		}
	}
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public void eliminaDipendente(Dipendente d) {
		dDao.getDipendenti().remove(d.getCF());
		for(Dipendente d2: dDao.getDipendenti().values()) {
			System.out.println(d2.getNome() + " " + d2.getCognome());
		}
	}
	
	@GET // http://localhost:5050/RestFulProject/webapi/dipendenti/codice=DEF&num=303
	@Produces(MediaType.APPLICATION_JSON)
	public Dipendente getQueryParam(@QueryParam("codice") String CF,@QueryParam("num") int num) {
		System.out.println("Valore ricevuto: " + num);
		return dDao.getDipendenti().get(CF);
	}
	
	//Se viene un url di questo tipo:
	//http://localhost:5050/NomeProgetto/webapi/dipendenti/{codiceDipendente}/bustapaga
	//arriva a questo metodo e viene reindirizzato a RisorsaBusta
	@Path("/{codiceDipendente}/bustapaga")
	public RisorsaBusta getBustaPaga() {
		return new RisorsaBusta();
	}

	
}
