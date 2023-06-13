import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class servidorRMI {
    // public static String HOST = "192.168.100.28";
    public static String HOST = "192.168.100.8";
    public static int PORT = 1099;
    public static void main(String[] args) throws RemoteException{
        try{
            System.setProperty("java.rmi.server.hostname", HOST);
            Registry rmi = LocateRegistry.createRegistry(PORT);
            rmi.rebind("Chat", (Remote) new implementacionChat());
            System.out.println("Servidor Activo");
        } catch(RemoteException e){}
    }
}

