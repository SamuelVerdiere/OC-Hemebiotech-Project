package com.hemebiotech.analytics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

class ISymptomReader extends AnalyticsCounter {

    private File file;
    private TreeMap<String, Integer> myMap;
    public ISymptomReader(File file){
        this.file = file;                   //on crée le fichier pour que le scanner travaille
    }
    public void readDatas() {

        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        this.myMap = new TreeMap<String, Integer>();   //on initialise fichier, scanner et Treemap - avec this. on fait référence à l'instance de classe

        while (sc.hasNext()) {                  //tant qu'il y a une ligne à lire
            String m = sc.nextLine();
            String[] input = m.split("[\n\t\r,.;:!?(){}]");  //on lance une boucle qui va lire des lignes de String

            for (int f = 0; f < input.length; f++) {
                String key = input[f].toUpperCase();            // la clé sera retournée en majuscule
                if (input[f].length() > 1) {                    // s'il reste des lignes
                    if (this.myMap.get(key) == null) {
                        this.myMap.put(key, 1);            //si la valeur du String est nulle on la passe à 1
                    } else {
                        this.myMap.put(key, (this.myMap.get(key)) + 1);  // si la valeur n'est pas nulle on ajoute 1
                    }
                }
            }
            }
        for (String entry : this.myMap.keySet()) {
            System.out.println(entry + " : " + this.myMap.get(entry));   //on affiche le résultat, symptôme : compte
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
