package com.alfasoft.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.alfasoft.entita.Fattura;

@WebService
public class FatturaDao implements IFatturaDao {
	
	private TreeMap<String,Fattura> fatture = null;
	
	public FatturaDao() {
		Fattura f1 = new Fattura("Boe", 1234, "Marco Boemi");
		Fattura f2 = new Fattura("Collo", 5678, "Andrea Colombo");
		Fattura f3 = new Fattura("Antho", 9876, "Anthony Reina");
		Fattura f4 = new Fattura("Daddy", 5432, "Dario Crusiglia");
		
		fatture = new TreeMap<String,Fattura>();
		fatture.put("Boe", f1);
		fatture.put("Collo", f2);
		fatture.put("Antho", f3);
		fatture.put("Daddy", f4);
	}
	
	public FatturaDao(TreeMap<String, Fattura> fatture) {
		this.fatture = fatture;
	}

	/* (non-Javadoc)
	 * @see com.alfasoft.dao.IFatturaDao#getTutteFatture()
	 */
	@Override
	@WebMethod
	public Fattura[] getTutteFatture() {
		List<Fattura> fat = new ArrayList<Fattura>(fatture.values());
		Fattura[] fattura = new Fattura[fat.size()];
		
		return fat.toArray(fattura);
	}
	
	/* (non-Javadoc)
	 * @see com.alfasoft.dao.IFatturaDao#getFatturaConCodice(java.lang.String)
	 */
	@Override
	@WebMethod
	public Fattura getFatturaConCodice(String codice) {
		return fatture.get(codice);
	}
	
	
	public TreeMap<String,Fattura> getFatture() {
		return fatture;
	}


	public void setFatture(TreeMap<String,Fattura> fatture) {
		this.fatture = fatture;
	}
}
