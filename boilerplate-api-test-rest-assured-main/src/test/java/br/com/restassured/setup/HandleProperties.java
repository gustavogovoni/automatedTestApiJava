package br.com.restassured.setup;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HandleProperties {
    private static final String CONFIG = "./src/test/resources/config.properties";
    private static Properties properties;

    public static String getProperties(String value){
        try{
            if (properties== null){
                HandleProperties.properties = new Properties();
                HandleProperties.properties.load(new FileInputStream(CONFIG));
            }
        } catch (IOException error){error.printStackTrace();}
        return HandleProperties.properties.getProperty(value);
    }
}
