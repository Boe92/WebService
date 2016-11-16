package com.alfasoft.main;

import javax.xml.ws.Endpoint;

import com.alfasoft.dao.FatturaDao;

public class SoapEndPoint {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1234/SoapProgetto2", new FatturaDao());
		
	}

}
