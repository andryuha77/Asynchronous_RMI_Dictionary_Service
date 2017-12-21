package ie.gmit.sw;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CreateDictionary {
	private String csvFile = "Resources/dictionary.csv";
	private StringBuilder definition = new StringBuilder();
	private HashMap<String, List<String>> dictionary = new HashMap<String, List<String>>();
	private String word = null;
	private String line = null;

	public void inputCSV() throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(csvFile)));

		while ((line = reader.readLine()) != null) {
			// if line start with " take in the first word as key for hashmap
			if (line.startsWith("\"")) {
				// or adds the word and definition to the dictionary hashmap if line not exist
				if (word != null) {
					addDefinition(word.toLowerCase(), definition.toString());
					// reset
					definition = new StringBuilder();
				}
				// otherwise find the end of the word
				int wordEnd = line.indexOf('"', 1);

				// makes a word from one quote to the next double quote
				word = line.substring(1, wordEnd);
				// add word definition
				definition.append((line.substring(wordEnd + 2)));
				definition.append("\n");
				// adding line/text to definition
			} else {
				definition.append((line));
				definition.append("\n");
			}
		} // end while
		reader.close();
	}

	// add the word with definition to hash map
	public void addDefinition(String word, String def) {
		// add definition to existing definition if word already exists
		if (dictionary.containsKey(word)) {
			List<String> definition = dictionary.get(word);
			definition.add(def);
			dictionary.put(word, definition);
		}
		// add word and definition to dictionary
		else {
			List<String> definition = new ArrayList<String>();
			definition.add(def);
			dictionary.put(word, definition);
		}
	}

	// get definition
	public List<String> get(String definition) {
		return dictionary.get(definition);
	}

/*	// Insert new word and definition to dictionary
	public String insertWord(String word, String def) {
		List<String> definition = new ArrayList<String>();
		definition.add(def);
		dictionary.put(word, definition);
		return "Word and Definition have been Added to Dictionary";
	}*/

	// get full dictionary
	public HashMap<String, List<String>> getDict() {
		return this.dictionary;
	}
}
