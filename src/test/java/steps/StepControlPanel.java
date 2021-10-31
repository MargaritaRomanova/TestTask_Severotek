package steps;

import pages.ControlPanelPage;

public class StepControlPanel {

    ControlPanelPage controlPanelPage = new ControlPanelPage();

    public void checkTitleTextPanelPage(String text){
        controlPanelPage.checkTitleTextPanelPage(text);
    }

    public StepEntryAdd executeInBlogEntries(){
        controlPanelPage.pressAddEntriesButton();
        return new StepEntryAdd();
    }
}