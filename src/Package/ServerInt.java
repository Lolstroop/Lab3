package Package;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerInt extends Remote{

    public double media(double[] prices) throws RemoteException;
    public double desvioP(double[] prices) throws RemoteException;
    public double maxValue(double[] prices) throws RemoteException;
    public double minValue(double[] prices) throws RemoteException;

}
