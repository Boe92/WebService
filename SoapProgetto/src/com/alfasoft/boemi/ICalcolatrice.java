package com.alfasoft.boemi;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ICalcolatrice {
	
	@WebMethod
	public abstract int add(int n1, int n2);

}