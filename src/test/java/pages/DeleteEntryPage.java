package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteEntryPage extends BasePage{

    @FindBy(xpath = "//*[@id='content']/form/div/input[@type='submit']")
    private WebElement confirmationButton;

    public DeleteEntryPage(){
        super();
    }

    public void pressConfirmationButton(){
        confirmationButton.click();
    }
}