package com.hemebiotech.analytics;

import resources.CanWritable;

import java.io.*;
import java.io.File;
import java.util.Map;
import java.util.TreeMap;
import java.io.IOException;
import java.io.FileWriter;

class WriteSymptomToFile implements CanWritable {

    /**
     * The file variable named file.
     * <p>It can only be accessed from within this class.</p>
     */
    //declare & initialize fil2, its output path and myMap
    private File file2 ;

    /**
     * The TreeMap named myMap.
     * <p>For more informations on TreeMap,
     * check documentation.</p>
     */

    private Map<String, Integer> myMap;

    /**
     * This is the parameterized constructor for file2.
     * <p>It constructs the value when the object is created.</p>
     * @param file2
     *
     * <p>The this keyword is a reference to the file object.
     * It is an explicit constructor invocation that will allow
     * use of the file object in another method.</p>
     */

    //constructor to use this.file2 in another class
    public WriteSymptomToFile(File file2) {
        this.file2 = new File(outputFilePath);
    }

    public void WriteDatas(TreeMap<String, Integer> map) {

/**
 * Declaring that this.myMap is a map.
 * For more information on TreeMap,
 * check documentation.*
 */
        //initializing map & declare bufferedWriter which is null
        this.myMap = map;

/**
 * Initializing the BufferedWriter to null for safety.
 * The BufferedWriter will write to the output file.
 */

        BufferedWriter bf = null;

/**
 * Intantiation of the BufferedWriter & a FileWriter
 * that will write on this.file2.
 *
 * The code is wrapped in try/catch to check for errors.
 */
        //initializing bufferedwriter to write on this.file2
        try {
            bf = new BufferedWriter(new FileWriter(this.file2));
        } catch (IOException e) {
            e.printStackTrace();
        }

/**
 * This for loop writes on the file.
 * <p> For each entry of String & Integer
 * from the myMap entry set, bf will write
 * each key and value; line after line.
 * </p>
 */
        //for values & keys in myMap, bf must write them as specified, line by line
        try {
            for (Map.Entry<String, Integer> entry : this.myMap.entrySet()) {
                bf.write(entry.getKey() + ": " + entry.getValue());
                bf.newLine();
            }

/**
 * This flushes the stream once the writing is done.
 * Finally, close the bf stream.
 */

            //flush the stream and close the writer when done
            bf.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert bf != null;
                bf.close();
            } catch (Exception e) {

            }
        }
    }
}