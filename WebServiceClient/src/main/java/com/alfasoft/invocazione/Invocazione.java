package com.alfasoft.invocazione;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;

public class Invocazione {

	private Client cliente= ClientBuilder.newClient();
	private WebTarget baseTarget= cliente.target("http://localhost:5050/RestFulProject2/webapi");
	private WebTarget dipTarget= baseTarget.path("/dipendenti");
	
	public Invocazione() {
		
	}
	
	public Invocation richiestaDipendenteByCode(String code){
		
		return dipTarget.path(code).request().buildGet();
	}
}