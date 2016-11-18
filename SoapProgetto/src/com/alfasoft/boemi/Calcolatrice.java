package com.alfasoft.boemi;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(name="boe", serviceName="ciao", portName="terry")
@SOAPBinding(style=Style.RPC)
public class Calcolatrice implements ICalcolatrice {
	

	@Override
	@WebMethod(operationName="somma")
	public int add(int n1, int n2) {
		return n1 + n2;
	}
		
}
