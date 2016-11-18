package com.alfasoft.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BustaPaga {
	private int id;
	private double importo;
	
	public BustaPaga() {}
	
	public BustaPaga(int id, double importo) {
		this.id = id;
		this.importo = importo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getImporto() {
		return importo;
	}
	public void setImporto(double importo) {
		this.importo = importo;
	}
	
	
}
