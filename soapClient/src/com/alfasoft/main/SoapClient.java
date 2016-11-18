package com.alfasoft.main;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.alfasoft.boemi.Calcolatrice;
import com.alfasoft.boemi.CalcolatriceServiceLocator;

public class SoapClient {

	public static void main(String[] args) {
		CalcolatriceServiceLocator locator = new CalcolatriceServiceLocator();
		
		try {
			Calcolatrice c = locator.getCalcolatrice();
			
			int risultato = c.add(5, 6);
			
			System.out.println(risultato);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
