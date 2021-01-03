package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

import entity.ScorePojo;

public interface ScoreInterface extends Remote {
	
	ScorePojo getByName(String name) throws RemoteException;
	long saveOne(ScorePojo scorePojo) throws RemoteException;

}
