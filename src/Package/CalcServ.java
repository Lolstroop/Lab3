package Package;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class CalcServ extends UnicastRemoteObject implements ServerInt {

    public CalcServ() throws RemoteException {}

    public double media(double[] prices) {
        double result = 0;
        for(int i = 0; i < prices.length; i++){
            result += Double.valueOf(prices[i]);
        }
        return result / prices.length;
    }

    public double desvioP(double[] prices) {

        double sum = 0.0;
        double desvioPadrao = 0.0;

        for(double i : prices) {
            sum += i;
        }
        double mean = sum/ prices.length;

        for(double i : prices) {
            desvioPadrao += Math.pow(i - mean, 2);
        }
        return Math.sqrt(desvioPadrao/ prices.length);
    }

    public double maxValue(double[] prices) {

        double max = prices[0];

        for(int i = 0; i < prices.length; i++) {

            if(prices[i] > max){
                max = prices[i];
            }
        }
        return max;
    }

    public double minValue(double[] prices) {

        double min = prices[0];

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
        }
        return min;
    }
}
