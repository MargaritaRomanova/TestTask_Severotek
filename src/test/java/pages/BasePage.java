package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static tests.BaseTest.getDriver;

public abstract class BasePage {
    WebDriver driver;
    WebDriverWait wait;
    Actions builder;
    JavascriptExecutor executor;

    public BasePage() {
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        builder = new Actions(driver);
        executor = (JavascriptExecutor) driver;
    }

    long randomGeneration(){
        long randomNumber = 11111111111L + (long)(Math.random() * ((99999999999L - 11111111111L) + 1));
        return randomNumber;
    }

    public void goBlogPage(){
        getDriver().get("https://igorakintev.ru/admin/blog/");
    }
}