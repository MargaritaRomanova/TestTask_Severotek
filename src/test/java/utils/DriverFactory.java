package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver getDriver (Browser browser){
        switch (browser){
            case CHROME:
                File file = new File(PropertyReader.getChromeDriverPath());
                System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setBinary(PropertyReader.getChromePath());
                driver = new ChromeDriver(chromeOptions);
                break;
            case FIREFOX:
                file = new File(PropertyReader.getFireFoxDriverPath());
                System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
                driver = new FirefoxDriver();
                break;
        }

        driver.manage().window().maximize();
        return driver;
    }
}