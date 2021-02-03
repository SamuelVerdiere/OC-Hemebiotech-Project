package com.hemebiotech.analytics;

import java.util.*;
import java.io.File;

/*public class ReadSymptomDataFromFile extends AnalyticsCounter { */
/*    static Iterator it = myMap.entrySet().iterator();           // l'élément it va utiliser les données de myMap pour créer une vue d'ensemble de tous les éléments
    static TreeMap<String, Integer> readDatas(File file) {      //

        while (it.hasNext()) {          //tant qu'il y a un élément dans l'ensemble
            Map.Entry pair = (Map.Entry) it.next();     // on voit chaque paire suivante de l'ensemble
            System.out.println(pair.getKey() + " " + pair.getValue()); // on affiche les valeurs de la paire, clé et valeur
        }
        return myMap;   //il faut une valeur return
    }
}*/


/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
/* public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
/*	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}
	
	@Override
	public List<String> GetSymptoms() {
		ArrayList<String> result = new ArrayList<String>();
		
		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				String line = reader.readLine();
				
				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

}*/