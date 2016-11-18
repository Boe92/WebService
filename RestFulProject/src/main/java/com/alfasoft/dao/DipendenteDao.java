package com.alfasoft.dao;

import java.util.Map;
import java.util.TreeMap;

import com.alfasoft.model.Dipendente;

public class DipendenteDao {
	private Map<String,Dipendente> dipendenti = null;

	public DipendenteDao() {
		dipendenti = new TreeMap<String, Dipendente>();
		
		Dipendente d1 = new Dipendente("Marco", "Boemi", 1234, "ABC");
		Dipendente d2 = new Dipendente("Luca", "Alfieri", 1234, "DEF");
		Dipendente d3 = new Dipendente("Anthony", "Reina", 1234, "GHI");
		
		dipendenti.put(d1.getCF(), d1);
		dipendenti.put(d2.getCF(), d2);
		dipendenti.put(d3.getCF(), d3);
	}
	
	
	public DipendenteDao(Map<String, Dipendente> dipendenti) {
		this.dipendenti = dipendenti;
	}

	public Map<String,Dipendente> getDipendenti() {
		return dipendenti;
	}

	public void setDipendenti(Map<String,Dipendente> dipendenti) {
		this.dipendenti = dipendenti;
	}
}
