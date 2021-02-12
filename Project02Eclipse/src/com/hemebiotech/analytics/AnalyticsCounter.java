package com.hemebiotech.analytics;

import resources.properties;

import java.io.File;

/**
 * <b> AnalyticsCounter is the class containing "main" method.</b>
 * <p>
 *     The program will execute these actions :
 *     <ul>
 *         <li>Read a text file.</li>
 *         <li>Sort and count all symptoms.</li>
 *         <li>Write the results; "symptoms : occurences".</li>
 *     </ul>
 * </p>
 *<p> The program will also write its properties.</p>
 *
 *
 * @author Samuel Verdière
 * @Version 1.0
 */

public class AnalyticsCounter {

	public static void main(String[] args) {
/**
 * <p>The code that will read the file.</p>
 * <p>We indicate the path of the file that must be read.</p>
 * <p>Then we effectively read them.</p>
 * @see readDatas();
 */

		//Declare and initialize File with path and method that will read (& count) data
		File file = new File(ReadSymptomOnFile.inputFilePath);
		ReadSymptomOnFile symptomReader = new ReadSymptomOnFile(file);
		symptomReader.readDatas();
/**
 * <p>The code that will write the results.</p>
 * <p>We indicate the path of the file in which to write.</p>
 * <p>Then effectively write them.</p>
 * @see WriteDatas();
 */

		//Declare and initialize File2 that will write results as expected
		File file2 = new File(WriteSymptomToFile.outputFilePath);
		WriteSymptomToFile wstf = new WriteSymptomToFile(file2);
		wstf.WriteDatas(symptomReader.getMyMap());
/**
 * Read properties from a file.
 */
		//create properties
		properties.Config();
	}
}