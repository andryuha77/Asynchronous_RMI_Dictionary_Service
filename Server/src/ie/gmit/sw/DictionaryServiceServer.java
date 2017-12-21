package ie.gmit.sw;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class DictionaryServiceServer {
	public static void main(String[] args) throws Exception {
		// Create an instance of a DictionaryServiceImpl. As DictionaryServiceImpl
		// implements the DictionaryService
		// interface, it can be referred to as a DictionaryService type.
		DictionaryService ds = new DictionaryServiceImpl();

		// Start the RMI registry on port 1099
		LocateRegistry.createRegistry(1099);

		// Bind remote object to the registry with the human-readable name
		Naming.rebind("dictionaryService", ds);

		// Print a message
		System.out.println("Server ready.");
	}
}
