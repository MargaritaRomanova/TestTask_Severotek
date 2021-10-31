package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import steps.StepLogin;
import utils.DriverFactory;
import utils.PropertyReader;

public class BaseTest {

    private static WebDriver driver;
    StepLogin steps;

    public static WebDriver getDriver(){
        return driver;
    }

    @BeforeClass
    public void setUp() {
        driver = DriverFactory.getDriver(PropertyReader.getBrowser());
        driver.get(PropertyReader.getUrl());
        steps = new StepLogin();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}