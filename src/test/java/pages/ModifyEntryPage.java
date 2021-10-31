package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ModifyEntryPage extends BasePage{

    @FindBy(xpath = "//*[text()='Удалить']")
    private WebElement deleteButton;

    public ModifyEntryPage(){
        super();
    }

    public void pressDeleteButton(){
        deleteButton.click();
    }
}