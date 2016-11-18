package com.alfasoft.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Dipendente {
	private String nome;
	private String cognome;
	private double stipendio;
	private String CF;
	
	public Dipendente() {}

	public Dipendente(String nome, String cognome, double stipendio, String CF) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.stipendio = stipendio;
		this.CF = CF;
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public double getStipendio() {
		return stipendio;
	}
	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	public String getCF() {
		return CF;
	}
	public void setCF(String CF) {
		this.CF = CF;
	}
}
