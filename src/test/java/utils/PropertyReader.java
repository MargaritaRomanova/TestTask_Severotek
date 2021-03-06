package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
    public static String getUrl() {
        return getProperty("url");
    }

    public static Browser getBrowser() {
        return Browser.valueOf(getProperty("Browser"));
    }

    public static String getChromeDriverPath(){
        return  getProperty("CHROME_DRIVER_PATH");
    }
    public static String getFireFoxDriverPath(){
        return getProperty("FIREFOX_DRIVER_PATH");
    }

    public static String getChromePath(){
        return  getProperty("CHROME_PATH");
    }

    public static String getLogin(){
        return  getProperty("Login");
    }

    public static String getPassword(){
        return  getProperty("Password");
    }

    private static String getProperty(String propertyName) {
        if (System.getProperty(propertyName) == null) {
            return getPropertyFromFile(propertyName);
        } else {
            return System.getProperty(propertyName);
        }
    }

    private static String getPropertyFromFile(String propertyName) {
        Properties properties = new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream("src/test/resources/testTask.properties");
            properties.load(input);
        } catch (IOException ex) {
            System.out.println("Cannot read property value for " + propertyName);
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return properties.getProperty(propertyName);
    }
}