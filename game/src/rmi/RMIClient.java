package rmi;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient {
	 // 根据主机IP和端口获取注册器
	   private static Registry registry =null;
	    

	  public static synchronized  void getRegistry() throws RemoteException {
		  if(registry==null) {
			 
				registry=LocateRegistry.getRegistry("localhost",2006);
		
		  }
	  }
	  
	  public static ScoreInterface getScoreInterface(){
		  try {
			getRegistry();
			 return (ScoreInterface) registry.lookup("scoreInterfaceImpl");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		  return null;
	  }
	  
}
