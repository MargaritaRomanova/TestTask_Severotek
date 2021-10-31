package steps;

import pages.LoginPage;

public class StepLogin {

    LoginPage loginPage = new LoginPage();

    public StepControlPanel executeLogin(){
        loginPage.fillLoginField();
        loginPage.fillPasswordField();
        loginPage.pressEntranceButton();
        return new StepControlPanel();
    }
}