package rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ScoreServer {
	
	public static void main(String[] args) {
		

				try {
					
					
					try {
						ScoreInterface scoreInterfaceImpl = new ScoreInterfaceImpl();
						
						
				        Registry registry = LocateRegistry.createRegistry(2006);
				        
				        registry.rebind("scoreInterfaceImpl", scoreInterfaceImpl);
				       
				        System.out.println("server is ready");
				        
					} catch (RemoteException e) {
						
						 System.out.println("rmi exception"+e.toString());
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			

	}
	


}
