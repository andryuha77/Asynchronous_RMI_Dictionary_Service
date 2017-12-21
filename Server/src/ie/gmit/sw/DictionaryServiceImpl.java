package ie.gmit.sw;

import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.List;

public class DictionaryServiceImpl extends UnicastRemoteObject implements DictionaryService {
	// variables
	private static final long serialVersionUID = 1L;
	private CreateDictionary cd;
	HashMap<String, List<String>> dictionaryMap;

	// create dictionary in constructor
	protected DictionaryServiceImpl() throws RemoteException, IOException {
		super();
		cd = new CreateDictionary();
		cd.inputCSV();
		dictionaryMap = cd.getDict();
	}

	// method used by client to search words in the dictionary.
	@Override
	public String getDefinition(String word) throws RemoteException {
		// return definition
		if (dictionaryMap.containsKey(word.toLowerCase())) {
			return dictionaryMap.get(word.toLowerCase()).toString();
		}
		// if word not exist return message
		return "Word does not exist try different one.";
	}

}
