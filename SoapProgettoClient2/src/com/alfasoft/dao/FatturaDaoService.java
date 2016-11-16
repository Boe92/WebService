/**
 * FatturaDaoService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.alfasoft.dao;

public interface FatturaDaoService extends javax.xml.rpc.Service {
    public java.lang.String getFatturaDaoAddress();

    public com.alfasoft.dao.FatturaDao getFatturaDao() throws javax.xml.rpc.ServiceException;

    public com.alfasoft.dao.FatturaDao getFatturaDao(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
