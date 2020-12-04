package Package;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class ServerProgram {
    public static void main(String args) {

        try {
            Naming.rebind("CalcServ1", new CalcServ());
            // rmi://127.0.0.1/CalcServ
        } catch (RemoteException e){
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
