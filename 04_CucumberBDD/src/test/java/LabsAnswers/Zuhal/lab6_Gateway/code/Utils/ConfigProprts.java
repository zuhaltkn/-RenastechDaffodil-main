package LabsAnswers.Zuhal.lab6_Gateway.code.Utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigProprts {


    private static Properties properties;

    static{
            try { properties= new Properties();
                FileInputStream file= new FileInputStream("src/test/java/students/Ulzana/lab6_Gateway/config.properties");
                properties.load(file);  }
            catch (Exception e){ e.getStackTrace();}    }


    public static String getProperties(String keyword){
        return properties.getProperty(keyword);
    }



}
