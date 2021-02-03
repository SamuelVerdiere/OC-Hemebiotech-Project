package com.hemebiotech.analytics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AnalyticsCounter {
	public static Scanner sc;
	public static File file;
	public static TreeMap<String, Integer> myMap = new TreeMap<String, Integer>();

public static void main(String[] args) throws FileNotFoundException {
	File file = new File("C:\\\\Users\\\\ADMIN\\\\IdeaProjects\\\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\\\Project02Eclipse\\\\src\\\\resources\\\\symptoms.txt");
	sc = new Scanner(file);
	ReadSymptomDataFromFile.readDatas(file);
}
}

/*
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AnalyticsCounter {
	public static void main(String args[]) throws FileNotFoundException {

		File file = new File("C:\\Users\\ADMIN\\IdeaProjects\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\src\\resources\\symptoms.txt");
		Scanner sc = new Scanner(file);
		TreeMap<String, Integer> myMap = new TreeMap<String, Integer>();   //on initialise fichier, scanner et Treemap

		while (sc.hasNext()) {
			String m = sc.nextLine();
			String[] input = m.split("[ \n\t\r,.;:!?(){}]");  //on lance une boucle qui va lire des lignes de String

			for (int f = 0; f < input.length; f++) {
				String key = input[f].toUpperCase();  			// la clé sera retournée en majuscule
				if(input[f].length() >1) {  					// s'il reste des lignes
					if (myMap.get(key) == null) {
						myMap.put(key, 1);  			//si la valeur du String est nulle on la passe à 1
					} else {
						myMap.put(key, (myMap.get(key)) +1);  // si la valeur n'est pas nulle on ajoute 1
					}
				}
			}
		}
		for (String entry : myMap.keySet()) {
			System.out.println(entry + " : " + myMap.get(entry));   //on affiche le résultat, symptôme : compte
		}
	}
}
*/