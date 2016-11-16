package com.alfasoft.dao;

import com.alfasoft.entita.Fattura;

public interface IFatturaDao {

	public abstract Fattura[] getTutteFatture();

	public abstract Fattura getFatturaConCodice(String codice);

}