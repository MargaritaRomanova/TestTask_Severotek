package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.PropertyReader;

public class LoginPage extends BasePage{

    @FindBy(id = "id_username")
    private WebElement loginField;

    @FindBy(id = "id_password")
    private WebElement passwordField;

    @FindBy(xpath = "//div/input[@value='Войти']")
    private WebElement entranceButton;

    public LoginPage() {
        super();
    }
    public void fillLoginField() {
        loginField.click();
        loginField.sendKeys(PropertyReader.getLogin());
    }
    public void fillPasswordField() {
        passwordField.click();
        passwordField.sendKeys(PropertyReader.getPassword());
    }
    public void pressEntranceButton(){
        entranceButton.click();
    }
}