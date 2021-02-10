package com.hemebiotech.analytics;

import java.io.*;
import java.io.File;
import java.util.Map;
import java.util.TreeMap;
import java.io.IOException;
import java.io.FileWriter;

class ReadSymptomDataFromFile extends AnalyticsCounter {

    /* private TreeMap<String, Integer> myMap;*/
    private String outputFilePath = "C:\\Users\\ADMIN\\IdeaProjects\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\src\\result.out";
    private File file2 ;       //on crée une nouvelle instance de file, File2 qui est le fichier de sortie String result.out
    private Map<String, Integer> myMap;

    /*public ISymptomReader(File file){
        this.myMap = new myMap<String, Integer>;                   //on crée le fichier pour que le scanner travaille
    }*/
    public ReadSymptomDataFromFile(File file2) {
        this.file2 = new File(outputFilePath);
     //construction  ??
    }

    public void WriteDatas(TreeMap<String, Integer> map) {
        this.myMap = map;
        BufferedWriter bf = null;
        try {
            bf = new BufferedWriter(new FileWriter(this.file2));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            /* bf = new BufferedWriter(new FileWriter(this.file2));*/
            for (Map.Entry<String, Integer> entry : this.myMap.entrySet()) {
                bf.write(entry.getKey() + ": " + entry.getValue());
                bf.newLine();                   //on obtient les résultats de myMap et on les écrit ligne par ligne
            }
            bf.flush();
        } catch (IOException e) {
            e.printStackTrace();                //try-catch et fermer le writer+vider le flux
        } finally {
            try {
                assert bf != null;
                bf.close();
            } catch (Exception e) {

            }
        }
    }
    public void setMyMap(TreeMap<String, Integer> myMap) {
        this.myMap = myMap;
    }
}

/*        for (String entry : this.myMap.keySet()) {
            System.out.println(entry + " : " + this.myMap.get(entry));*/

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