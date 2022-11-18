package labreport;



import java.rmi.*;
public interface AddRem extends Remote {
   public int addNum(int a, int b) throws RemoteException;
   // public int factorial(int a) throws RemoteException;
      
}
