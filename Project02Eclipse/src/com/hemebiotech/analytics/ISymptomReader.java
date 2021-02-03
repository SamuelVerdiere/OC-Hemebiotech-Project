package com.hemebiotech.analytics;

import java.io.File;

class ISymptomReader extends AnalyticsCounter {
    static void readDatas(File file) {

        while (sc.hasNext()) {
            String m = sc.nextLine();
            String[] input = m.split("[ \n\t\r,.;:!?(){}]");  //on lance une boucle qui va lire des lignes de String

            for (int f = 0; f < input.length; f++) {
                String key = input[f].toUpperCase();            // la clé sera retournée en majuscule
                if (input[f].length() > 1) {                    // s'il reste des lignes
                    if (myMap.get(key) == null) {
                        myMap.put(key, 1);            //si la valeur du String est nulle on la passe à 1
                    } else {
                        myMap.put(key, (myMap.get(key)) + 1);  // si la valeur n'est pas nulle on ajoute 1
                    }
                }
            }
        }
    }
}

/*
import java.util.List;

/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 * 
 * The implementation does not need to order the list
 * 
 */
/* public interface ISymptomReader {
	/**
	 * If no data is available, return an empty List
	 * 
	 * @return a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
	 */
/*	List<String> GetSymptoms ();
} */
