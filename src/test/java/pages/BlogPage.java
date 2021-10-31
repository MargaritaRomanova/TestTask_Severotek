package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BlogPage extends BasePage{

    public BlogPage(){
        super();
    }

    public void findCurrentEntryAndPress(String titleValue){
        WebElement value = driver.findElement(By.xpath("//*[contains(text(),'"+titleValue+"')]"));
        value.click();
    }
}