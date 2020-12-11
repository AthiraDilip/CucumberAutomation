package utils;

import java.io.*;
import java.util.Properties;

public class PropertyReader {
    static Properties properties = new Properties();
    static void loadProp() throws IOException {
        properties.load(new InputStreamReader(new FileInputStream(new File("src/test/resources/environment.properties"))));
    }

    public static String getProp(String key){
        if(properties.getProperty(key) == null){
            return "Key not found";
        }else{
            return properties.getProperty(key);
        }
    }
}
