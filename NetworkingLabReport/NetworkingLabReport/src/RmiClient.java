package labreport;

import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class RmiClient {

    public static void main(String args[]) throws RemoteException {
        RmiClient c = new RmiClient();
        c.connectRemote();
    }

    private void connectRemote() throws RemoteException {
        try {
            Registry reg = LocateRegistry.getRegistry("localhost", 5000);
            AddRem ad = (AddRem) reg.lookup("Hi Server");
            
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter First Number");
           int a = sc.nextInt();
            

           System.out.println("Enter Second Number");
           int b = sc.nextInt();

          //  System.out.println("Enter Number ");
           // int a = sc.nextInt();
            
            //System.out.println("Factorial of "+a+" is " + ad.factorial(a));
            
            
            
            
     
            System.out.println("Addition: " + ad.addNum(a, b));
        } catch (NotBoundException | RemoteException e) {
            System.out.println(e);
        }
    }
}
