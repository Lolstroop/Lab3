package Package;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

    private ServerInt serverInt;
    public Client() {

        try {
            serverInt = (ServerInt) Naming.lookup("rmi://127.0.0.1/CalcServ");
        } catch(NotBoundException e){
            e.printStackTrace();
        } catch(RemoteException e) {
            e.printStackTrace();
        } catch(MalformedURLException e){
            e.printStackTrace();
        }

        public double media(double[] prices) throws RemoteException {
            return serverInt.media(prices);
        }

        public double desvioP(double[] prices) throws RemoteException {
            return serverInt.desvioP(prices);
        }

        public double maxValue(double[] prices) throws RemoteException {
            return serverInt.maxValue(prices);
        }

        public double minValue(double[] prices) throws RemoteException {
            return serverInt.minValue(prices);
        }
    }
}
