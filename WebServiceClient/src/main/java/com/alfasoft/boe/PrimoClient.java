package com.alfasoft.boe;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import com.alfasoft.model.Dipendente;

public class PrimoClient {

	public static void main(String[] args) {
		//Factory pattern, crea oggetto cliente
		Client cliente = ClientBuilder.newClient();
		
		/****** GET ******/
		
		//URL base al quale poi aggiungiamo pezzi
		WebTarget BaseTargetUrl = cliente.target("http://localhost:5050/RestFulProject2/webapi");
		
		WebTarget DipTargetUrl = BaseTargetUrl.path("/dipendenti"); 
		
		WebTarget SingoloDipTarget = DipTargetUrl.path("/{codiceDip}");
		
		Response response = SingoloDipTarget.resolveTemplate("codiceDip", "ABC")
											.request()
											.get();
		
		Dipendente d = response.readEntity(Dipendente.class);
		
		System.out.println(d.getNome()+" "+d.getCognome()+" "+d.getCF());
		
		
		/****** POST ******/
		
		Dipendente d2 = new Dipendente("Marco","Boez",9999,"BMOMRC92");
		Response response2 = DipTargetUrl.request().post(Entity.json(d2));
		if(response2.getStatus()!=201) {
			System.out.println("Qualcosa è andato storto!");
		}
		System.out.println(response2.getStatus());
		
		
		/****** GET Lista ******/
		
		
		Response response3 = cliente.target("http://localhost:5050/RestFulProject2/webapi/dipendenti/listaDipendentiJson")
				.request()
				.get();

		List<Dipendente> dipendenti = response3.readEntity(new GenericType<List<Dipendente>>(){});
		
		for(Dipendente d1:dipendenti) {
			System.out.println(d1.getNome()+" "+d1.getCognome()+" "+d1.getCF());
		}
		
		
		/***** Oppure Tutto insieme *****/ 
		
		/****** GET ******/
		
//		Response response = cliente.target("http://localhost:5050/RestFulProject2/webapi/dipendenti/ABC")
//							.request()
//							.get();
//		
//		Dipendente d = response.readEntity(Dipendente.class);
//		
//		System.out.println(d.getNome()+" "+d.getCognome()+" "+d.getCF());
	}
}
