package steps;

import pages.DeleteEntryPage;

public class StepDeleteEntry {

    DeleteEntryPage deleteEntryPage = new DeleteEntryPage();

    public StepBlog pressConfirmationButton(){
        deleteEntryPage.pressConfirmationButton();
        return new StepBlog();
    }
}