package com.alfasoft.entita;

public class Fattura {
	private String codiceCliente;
	private int importo;
	private String ragioneSociale;
	
	public Fattura() {}
	
	public Fattura(String codiceCliente, int importo, String ragioneSociale) {
		this.codiceCliente = codiceCliente;
		this.importo = importo;
		this.ragioneSociale = ragioneSociale;
	}
	
	
	public String getCodiceCliente() {
		return codiceCliente;
	}
	public void setCodiceCliente(String codiceCliente) {
		this.codiceCliente = codiceCliente;
	}
	public int getImporto() {
		return importo;
	}
	public void setImporto(int importo) {
		this.importo = importo;
	}
	public String getRagioneSociale() {
		return ragioneSociale;
	}
	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

}
