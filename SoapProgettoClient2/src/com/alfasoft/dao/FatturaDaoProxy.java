package com.alfasoft.dao;

public class FatturaDaoProxy implements com.alfasoft.dao.FatturaDao {
  private String _endpoint = null;
  private com.alfasoft.dao.FatturaDao fatturaDao = null;
  
  public FatturaDaoProxy() {
    _initFatturaDaoProxy();
  }
  
  public FatturaDaoProxy(String endpoint) {
    _endpoint = endpoint;
    _initFatturaDaoProxy();
  }
  
  private void _initFatturaDaoProxy() {
    try {
      fatturaDao = (new com.alfasoft.dao.FatturaDaoServiceLocator()).getFatturaDao();
      if (fatturaDao != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)fatturaDao)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)fatturaDao)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (fatturaDao != null)
      ((javax.xml.rpc.Stub)fatturaDao)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.alfasoft.dao.FatturaDao getFatturaDao() {
    if (fatturaDao == null)
      _initFatturaDaoProxy();
    return fatturaDao;
  }
  
  public com.alfasoft.entita.Fattura getFatturaConCodice(java.lang.String codice) throws java.rmi.RemoteException{
    if (fatturaDao == null)
      _initFatturaDaoProxy();
    return fatturaDao.getFatturaConCodice(codice);
  }
  
  public com.alfasoft.entita.Fattura[] getTutteFatture() throws java.rmi.RemoteException{
    if (fatturaDao == null)
      _initFatturaDaoProxy();
    return fatturaDao.getTutteFatture();
  }
  
  
}