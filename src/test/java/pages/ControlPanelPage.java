package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertEquals;

public class ControlPanelPage extends BasePage{

    @FindBy(xpath = "//div/h1[@class='dashboard-title']")
    private WebElement titlePanelPage;

    @FindBy(xpath = "//*[@href ='/admin/blog/entry/add/']")
    private WebElement addEntriesButton;

    public ControlPanelPage() {
        super();
    }

    public void checkTitleTextPanelPage(String text){
         assertEquals(titlePanelPage.getText(), text,"Wrong text has been displayed!");
    }

    public void pressAddEntriesButton(){
        addEntriesButton.click();
    }
}