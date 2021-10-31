package tests;

import org.testng.annotations.Test;
import steps.*;

public class MainTest extends BaseTest {

    @Test
    public void checkAddEntryAndDelete(){

        StepControlPanel stepControlPanel = steps.executeLogin();
        stepControlPanel.checkTitleTextPanelPage("Панель управления");

        StepEntryAdd stepEntryAdd = stepControlPanel.executeInBlogEntries();
        stepEntryAdd.checkTitleTextEntryAddPage("Добавить entry");
        stepEntryAdd.addTextAndPressSave();

        StepBlog stepBlog = stepEntryAdd.goBlogPage();

        StepModifyEntry stepModifyEntry = stepBlog.selectElement(stepEntryAdd.getTitleValue());

        StepDeleteEntry stepDeleteEntry = stepModifyEntry.pressDeleteButton();
        stepDeleteEntry.pressConfirmationButton();
    }
}
