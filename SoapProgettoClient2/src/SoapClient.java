import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.alfasoft.dao.FatturaDao;
import com.alfasoft.dao.FatturaDaoServiceLocator;
import com.alfasoft.entita.Fattura;


public class SoapClient {

	public static void main(String[] args) {
		FatturaDaoServiceLocator locator = new FatturaDaoServiceLocator();
		
		try {
			FatturaDao fd = locator.getFatturaDao();
			Fattura[] fatture = fd.getTutteFatture();
			
			for(int i = 0; i<fatture.length; i++) {
				System.out.println(fatture[i].getCodiceCliente()+" "+fatture[i].getImporto()+" "+fatture[i].getRagioneSociale());
			} 
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
