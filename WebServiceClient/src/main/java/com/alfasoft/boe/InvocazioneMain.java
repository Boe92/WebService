package com.alfasoft.boe;

import javax.ws.rs.core.Response;

import com.alfasoft.invocazione.Invocazione;
import com.alfasoft.model.Dipendente;

public class InvocazioneMain {

	public static void main(String[] args) {

		Invocazione invocazione = new Invocazione();
		
		Response risposta = invocazione.richiestaDipendenteByCode("ABC")
					.invoke();
		
		Dipendente d = risposta.readEntity(Dipendente.class);
		
		System.out.println(d.getNome()+ " " + d.getCognome());

	}

}
