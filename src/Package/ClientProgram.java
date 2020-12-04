package Package;

import java.rmi.RemoteException;

public class ClientProgram {
    public static void main(String[] args){

        Client client = new Client();
        try {
            System.out.println(client.media());
            System.out.println(client.desvioP());
            System.out.println(client.maxValue());
            System.out.println(client.minValue());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
