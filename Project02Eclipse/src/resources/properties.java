package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Properties;

public class properties extends Hashtable {

    public static void Config() {

        FileInputStream fis;
        File configFile;

        try {
            configFile = new File("C:\\Users\\ADMIN\\IdeaProjects\\Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application\\Project02Eclipse\\src\\resources\\config.properties");
            fis = new FileInputStream(configFile);
            Properties propConfig = new Properties();
            propConfig.load(fis);

            String Prop =("PROPERTIES");
            String Version = propConfig.getProperty("Version");
            String Name = propConfig.getProperty("Name");
            String Date = propConfig.getProperty("Date");
            String InputFilePath = propConfig.getProperty("InputFilePath");
            String OutputFilePath = propConfig.getProperty("OutputFilePath");

            System.out.println(Prop);
            System.out.println("Name : " + Name);
            System.out.println("Version : " + Version);
            System.out.println("Date: " + Date);
            System.out.println("InputFilePath: " + InputFilePath);
            System.out.println("OutPutFilePath: " + OutputFilePath);

            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}