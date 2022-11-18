package labreport;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer extends UnicastRemoteObject implements AddRem {

    RMIServer() throws RemoteException {
        super();
    }

    public int addNum(int x, int y) {
       return x + y;
   }
    
   /* public int factorial(int x){
        int i ;
        int f = 1;
        
        for (i = 1; i <= x; i++) {
            f = f * i;
        }
        return f;
    }
*/

    public static void main(String args[]) {
        try {
            Registry reg = LocateRegistry.createRegistry(5000);
            reg.rebind("Hi Server", new RMIServer());
            System.out.println("Server is ready ...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
