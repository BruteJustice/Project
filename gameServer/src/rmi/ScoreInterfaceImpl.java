package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import dao.ScoreDao;
import entity.ScorePojo;

public class ScoreInterfaceImpl extends UnicastRemoteObject  implements ScoreInterface {

	
	private static final long serialVersionUID = 357568958079253617L;

	protected ScoreInterfaceImpl() throws RemoteException {
		super();
	}

	@Override
	public ScorePojo getByName(String name) throws RemoteException {
		return ScoreDao.getByName(name);
	}

	@Override
	public long saveOne(ScorePojo scorePojo) throws RemoteException {
		ScorePojo getOne=ScoreDao.getByName(scorePojo.getUsername());
		if(getOne==null) {
			return ScoreDao.addOne(scorePojo);
		}else {
			return ScoreDao.updateOne(scorePojo);
		}
		
		
	}

}
