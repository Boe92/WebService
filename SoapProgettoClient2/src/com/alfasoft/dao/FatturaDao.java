/**
 * FatturaDao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alfasoft.dao;

public interface FatturaDao extends java.rmi.Remote {
    public com.alfasoft.entita.Fattura getFatturaConCodice(java.lang.String codice) throws java.rmi.RemoteException;
    public com.alfasoft.entita.Fattura[] getTutteFatture() throws java.rmi.RemoteException;
}
