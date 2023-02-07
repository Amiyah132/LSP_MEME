package org.howard.edu.lsp.assignment2;

import java.io.FileNotFoundException;
import java.util.*; //allows use of HashMap

public class Driver {

	public static void main(String[] args) {
		FileReader fr = new FileReader(); //FileReader to read file
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>(); //creating a HashMap containing string
		try {
			String filepath = fr.readToString("words.txt"); //accessing text file
			System.out.println(filepath);
			String[] str_split = filepath.replaceAll("[^a-zA-z ]",  "").toLowerCase().split(" ");// reads lowercase and uppercase as the same
			for (int i = 0; i < str_split.length; i++) { 
				if (str_split[i].length() > 3) { // checks if word is 3 characters
					if (hashmap.get(str_split[i]) == null) {
						hashmap.put(str_split[i],1); //sets the number of occurrences to 1
								}
					else {
						hashmap.put(str_split[i],  hashmap.get(str_split[i]) + 1); 
					}
				}
			}
			for (String word : hashmap.keySet()) {
				System.out.println(word + " " + hashmap.get(word)); //printing 
			}
		}
		catch (FileNotFoundException e) { 
			System.out.println("Unable to open resource");
		}
		}
}